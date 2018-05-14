package com.appinfo.service;


import com.appinfo.entity.DevUser;

public interface DevUserService {
    public DevUser getDevUserLogin(String devCode,String devPassWord);//登陆
}
