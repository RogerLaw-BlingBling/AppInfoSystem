package com.appinfo.service.impl;

import com.appinfo.dao.UserDao;
import com.appinfo.entity.User;
import com.appinfo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.annotation.Resources;
@Service
public class UserServiceImpl implements UserService {

     @Resource
     private UserDao userMapper;

     public  User findUserbydevCode(String devCode){
         return userMapper.getBydevCode(devCode);
     }
}
