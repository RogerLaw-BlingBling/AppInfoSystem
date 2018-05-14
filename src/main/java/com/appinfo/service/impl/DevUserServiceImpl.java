package com.appinfo.service.impl;

import com.appinfo.dao.DevUserDao;
import com.appinfo.entity.DevUser;
import com.appinfo.service.DevUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//仔仔加的
@Service("devUserService")
public class DevUserServiceImpl implements DevUserService {

     @Resource
     private DevUserDao userMapper;


    @Override
    public DevUser findDevUserbydevCode(String devCode) {
        return userMapper.getBydevCode(devCode);
    }
}
