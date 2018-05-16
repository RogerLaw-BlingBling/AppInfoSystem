package com.appinfo.service.impl;

import com.appinfo.dao.AppInfoDao;
import com.appinfo.entity.AppInfo;
import com.appinfo.service.AppInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.File;
import java.util.List;

@Service
public class AppInfoServiceImpl implements AppInfoService {


    @Override
    public List<AppInfo> appInfoList(String querySoftwareName, Integer queryStatus, Integer queryCategoryLevel1, Integer queryCategoryLevel2, Integer queryCategoryLevel3, Integer queryFlatformId, Integer devId, Integer from, Integer pageSize) throws Exception {
        return null;
    }

    @Override
    public int getAppInfoCount(String querySoftwareName, Integer queryStatus, Integer queryCategoryLevel1, Integer queryCategoryLevel2, Integer queryCategoryLevel3, Integer queryFlatformId, Integer devId) throws Exception {
        return 0;
    }

    @Override
    public boolean add(AppInfo appinfo) throws Exception {
        return false;
    }

    @Override
    public AppInfo selectAppInfoAPKNameExist(String APKName) throws Exception {
        return null;
    }

    @Override
    public boolean modify(AppInfo appinfo) throws Exception {
        return false;
    }

    @Override
    public AppInfo getAppInfoById(Integer id) throws Exception {
        return null;
    }

    @Override
    public boolean delAppInfoById(Integer id) throws Exception {
        return false;
    }

    @Override
    public boolean updatePath(AppInfo appinfo) throws Exception {
        return false;
    }

    @Override
    public List<AppInfo> appList(String querySoftwareName, Integer queryStatus, Integer queryCategoryLevel1, Integer queryCategoryLevel2, Integer queryCategoryLevel3, Integer queryFlatformId, Integer from, Integer pageSize) throws Exception {
        return null;
    }

    @Override
    public int getAppCount(String querySoftwareName, Integer queryStatus, Integer queryCategoryLevel1, Integer queryCategoryLevel2, Integer queryCategoryLevel3, Integer queryFlatformId) throws Exception {
        return 0;
    }
}