package com.appinfo.service.impl;

import com.appinfo.dao.AppInfoDao;
import com.appinfo.entity.AppInfo;

import javax.annotation.Resource;
import java.util.List;

public class AppInfoServiceImpl implements AppInfoDao {
    @Resource
    private AppInfoDao appInfoDao;


    @Override
    public List<AppInfo> getAppInfoList(String querySoftwareName,
                                        Integer queryStatus, Integer queryCategoryLevel1,
                                        Integer queryCategoryLevel2, Integer queryCategoryLevel3,
                                        Integer queryFlatformId, Integer devId, Integer currentPageNo,
                                        Integer pageSize) throws Exception {
        return appInfoDao.getAppInfoList(querySoftwareName, queryStatus,
                queryCategoryLevel1, queryCategoryLevel2, queryCategoryLevel3,
                queryFlatformId, devId, (currentPageNo - 1) * pageSize,
                pageSize);
    }
}
