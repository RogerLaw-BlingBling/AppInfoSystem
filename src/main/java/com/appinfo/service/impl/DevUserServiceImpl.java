package com.appinfo.service.impl;

import com.appinfo.dao.DevUserDao;
import com.appinfo.entity.DevUser;
import com.appinfo.service.DevUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("devUserService")
public class DevUserServiceImpl implements DevUserService {

    @Resource(name="devuserDao")
    private DevUserDao devuserDao;


    @Override
    public DevUser findDevUserbydevCode(String devCode) {
        return devuserDao.getBydevCode(devCode);
    }
}
