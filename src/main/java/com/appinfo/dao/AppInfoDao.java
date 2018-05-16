package com.appinfo.dao;

import com.appinfo.entity.AppInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppInfoDao {

    public List<AppInfo> appInfoList(@Param("softwareName")String querySoftwareName,
                                     @Param("status")Integer queryStatus,
                                     @Param("categoryLevel1")Integer queryCategoryLevel1,
                                     @Param("categoryLevel2")Integer queryCategoryLevel2,
                                     @Param("categoryLevel3")Integer queryCategoryLevel3,
                                     @Param("flatformId")Integer queryFlatformId,
                                     @Param("devId")Integer devId,
                                     @Param("from")Integer from,
                                     @Param("pageSize")Integer pageSize)throws Exception;

    public int getAppInfoCount(@Param("softwareName")String querySoftwareName,
                               @Param("status")Integer queryStatus,
                               @Param("categoryLevel1")Integer queryCategoryLevel1,
                               @Param("categoryLevel2")Integer queryCategoryLevel2,
                               @Param("categoryLevel3")Integer queryCategoryLevel3,
                               @Param("flatformId")Integer queryFlatformId,
                               @Param("devId")Integer devId)throws Exception;

    public int appinfoadd(AppInfo appinfo)throws Exception;

    public AppInfo selectAPKName(@Param("APKName")String APKName)throws Exception;

    public int appinfomodify(AppInfo appinfo)throws Exception;

    public AppInfo getAppInfoById(@Param("id")Integer id)throws Exception;

    public boolean delAppInfoById(@Param("id")Integer id)throws Exception;

    public int updatePath(AppInfo appinfo)throws Exception;



    public List<AppInfo> appList(@Param("softwareName")String querySoftwareName,
                                 @Param("status")Integer queryStatus,
                                 @Param("categoryLevel1")Integer queryCategoryLevel1,
                                 @Param("categoryLevel2")Integer queryCategoryLevel2,
                                 @Param("categoryLevel3")Integer queryCategoryLevel3,
                                 @Param("flatformId")Integer queryFlatformId,
                                 @Param("from")Integer from,
                                 @Param("pageSize")Integer pageSize)throws Exception;

    public int getAppCount(@Param("softwareName")String querySoftwareName,
                           @Param("status")Integer queryStatus,
                           @Param("categoryLevel1")Integer queryCategoryLevel1,
                           @Param("categoryLevel2")Integer queryCategoryLevel2,
                           @Param("categoryLevel3")Integer queryCategoryLevel3,
                           @Param("flatformId")Integer queryFlatformId)throws Exception;
}
