package com.appinfo.controller;

import com.appinfo.entity.BackendUser;
import com.appinfo.service.BackendUserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Author: ZaiZai
 * @Date: Created in 2018/5/14 23:26
 */

@Controller
@RequestMapping(value = "/Backend")
public class BackendUserController {
    private Logger log = Logger.getLogger(BackendUserController.class);

    @Resource(name = "backendUserService")
    private BackendUserService backendUserService;

    @RequestMapping(value = "/backendlogin")
    public String login() {
        log.info("进入后台管理");
        return "/backendlogin";
    }


    //登陆
    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    public String doLogin(@RequestParam(value = "userCode") String userCode,
                          @RequestParam(value = "userPassword") String userPassword,
                          HttpSession session, HttpServletRequest request) throws Exception{
        log.info("执行登陆流程");
        log.info(userCode + "和" + userPassword);
        BackendUser backendUser = backendUserService.getBackendLogin(userCode, userPassword);
        if (null != backendUser) {

            session.setAttribute("backendUser", backendUser);
            return "backend/main";

        } else {
            request.setAttribute("error", "账号或密码不对");
            return "/backendlogin";
        }

    }

    //注销
    @RequestMapping(value = "/loginOut")
    public String loginOut(HttpSession session) {
        session.removeAttribute("backenUser");
        return "redirect:../index.jsp";
    }

    //跳转到app维护
    @RequestMapping(value = "/appinfolist")
    public String appinfolist(){
        return "backend/applist";
    }
}