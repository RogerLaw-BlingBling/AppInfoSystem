package com.appinfo.service;

import com.appinfo.entity.BackendUser;

/**
 * @Author: ZaiZai
 * @Date: Created in 2018/5/14 23:29
 */
public interface BackendUserService {

    BackendUser getBackendLogin(String userCode, String userPassword);//后台管理登陆
}
