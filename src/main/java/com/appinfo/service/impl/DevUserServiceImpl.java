package com.appinfo.service.impl;

import com.appinfo.dao.DevUserDao;
import com.appinfo.entity.DevUser;
import com.appinfo.service.DevUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("devUserService")
public class DevUserServiceImpl implements DevUserService {

     @Resource
     private DevUserDao devuserMapper;

     public DevUser findUserbydevCode(String devCode){
         return devuserMapper.getBydevCode(devCode);
     }
}
