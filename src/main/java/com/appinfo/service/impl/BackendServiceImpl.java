package com.appinfo.service.impl;

import com.appinfo.dao.BackendUserDao;
import com.appinfo.entity.BackendUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: ZaiZai
 * @Date: Created in 2018/5/14 23:16
 */

@Service("backendService")
public class BackendServiceImpl {

    @Resource(name = "backendUserDao")
    private BackendUserDao backendUserDao;

    public BackendUser getBackendLogin(String userCode, String userPassword) {
        BackendUser backend = null;
        try {
            backend = backendUserDao.getBenkendLogin(userCode);
        }catch (Exception e) {
            e.printStackTrace();
        }
        // 匹配密碼
        if (null != backend) {
            if (!backend.getUserPassword().equals(userPassword)) {
                backend = null;
            }
        }
        return backend;
    }
}
