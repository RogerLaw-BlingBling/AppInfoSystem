package com.appinfo.service;

import com.appinfo.entity.AppInfo;

import java.util.List;

/**
 * @author: Huar
 * @create: 2018-05-14 11:03
 **/
public interface AppInfoService {

    public List<AppInfo> getAppInfoList(String querySoftwareName,
                                        Integer queryStatus,
                                        Integer queryCategoryLevel1,
                                        Integer queryCategoryLevel2,
                                        Integer queryCategoryLevel3,
                                        Integer queryFlatformId,
                                        Integer devId,
                                        Integer currentPageNo,
                                        Integer pageSize) throws Exception;
}
