package com.appinfo.service;

import com.appinfo.entity.AppInfo;

import java.util.List;

/**
 * @author: Huar
 * @create: 2018-05-14 11:03
 **/
public interface AppInfoService {

    List<AppInfo> getAppInfoList(String querySoftwareName,
                                 Integer queryStatus, Integer queryCategoryLevel1,
                                 Integer queryCategoryLevel2, Integer queryCategoryLevel3,
                                 Integer queryFlatformId, Integer devId, Integer currentPageNo,
                                 Integer pageSize) throws Exception;

    int getAppInfoCount(String querySoftwareName, Integer queryStatus,
                        Integer queryCategoryLevel1, Integer queryCategoryLevel2,
                        Integer queryCategoryLevel3, Integer queryFlatformId, Integer devId)
            throws Exception;
    /**
     * 根據id查询app信息
     */
    AppInfo getAppinfoId(String id);
    /**
     * 新增
     */
    boolean addAppinfo(AppInfo in);

    AppInfo getAppFind(Integer id, String apkName);
    boolean deleteAppinfo(int id);
    boolean deleteAppVersion(String id);

    boolean updateAppinfo(AppInfo info);
    boolean updateStatus(Integer appid, Integer statu);//修改状态
}
