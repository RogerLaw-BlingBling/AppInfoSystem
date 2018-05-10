package com.appinfo.service;

        import com.appinfo.entity.User;

public interface UserService {
    User findUserbydevCode(String devCode);
}
