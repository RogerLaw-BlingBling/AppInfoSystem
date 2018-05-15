package com.appinfo.service.impl;

import com.appinfo.dao.BackendUserDao;
import com.appinfo.entity.BackendUser;
import com.appinfo.service.BackendUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: ZaiZai
 * @Date: Created in 2018/5/14 23:16
 */

@Service("backendUserService")
public class BackendUserServiceImpl implements BackendUserService {

    @Resource(name = "backendUserDao")
    private BackendUserDao backendUserDao;

    public BackendUser getBackendLogin(String userCode, String userPassword) {

        BackendUser backend = backendUserDao.getBenkendLogin(userCode);

        // 匹配密码
        if (null != backend) {
            if (!backend.getUserPassword().equals(userPassword)) {
                backend = null;
            }
        }
        return backend;
    }
}
