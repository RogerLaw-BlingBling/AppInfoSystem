package com.appinfo.service;/**

 */

import com.appinfo.entity.AppVersion;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Huar
 * @create: 2018-05-16 10:00
 **/

public interface AppVersionService {
    public boolean addVersion(AppVersion av);//新增
    public List<AppVersion> getAppVersionId(Integer id);

    public AppVersion getVerSionId(Integer id);

    public boolean updateVersion(AppVersion appVersion);//修改
}
