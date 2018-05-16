package com.appinfo.service;/**

 */

import com.appinfo.entity.AppVersion;

import java.util.ArrayList;

/**
 * @author: Huar
 * @create: 2018-05-16 10:00
 **/

public interface AppVersionService {
    boolean add(AppVersion appversion) throws Exception;

    ArrayList<AppVersion> getAppVersionById(Integer appId)throws Exception;

    AppVersion getAppVersionByCon(Integer appId, String versionNo)throws Exception;

    AppVersion getAppVersionByCom(Integer id)throws Exception;

    boolean appversionmodify(AppVersion appversion)throws Exception;
}
