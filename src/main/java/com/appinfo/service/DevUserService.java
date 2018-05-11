package com.appinfo.service;


import com.appinfo.entity.DevUser;

public interface DevUserService {
    DevUser findUserbydevCode(String devCode);
}
