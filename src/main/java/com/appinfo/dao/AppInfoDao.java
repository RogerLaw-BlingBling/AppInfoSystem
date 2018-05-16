package com.appinfo.dao;

import com.appinfo.entity.AppInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("appInfoDao")
public interface AppInfoDao {

    List<AppInfo> getAppInfoList(
            @Param(value = "softwareName") String querySoftwareName,
            @Param(value = "status") Integer queryStatus,
            @Param(value = "categoryLevel1") Integer queryCategoryLevel1,
            @Param(value = "categoryLevel2") Integer queryCategoryLevel2,
            @Param(value = "categoryLevel3") Integer queryCategoryLevel3,
            @Param(value = "flatformId") Integer queryFlatformId,
            @Param(value = "devId") Integer devId,
            @Param(value = "from") Integer currentPageNo,
            @Param(value = "pageSize") Integer pageSize) throws Exception;

    int getAppInfoCount(
            @Param(value = "softwareName") String querySoftwareName,
            @Param(value = "status") Integer queryStatus,
            @Param(value = "categoryLevel1") Integer queryCategoryLevel1,
            @Param(value = "categoryLevel2") Integer queryCategoryLevel2,
            @Param(value = "categoryLevel3") Integer queryCategoryLevel3,
            @Param(value = "flatformId") Integer queryFlatformId,
            @Param(value = "devId") Integer devId) throws Exception;

    AppInfo getAppinfoId(@Param("id") String id) throws Exception;
    int addAppinfo(AppInfo in);
    AppInfo getAppFind(@Param("id") Integer id, @Param("apkName") String apkName);
    int updateVersionId(@Param("VerSionId") Integer verSionId, @Param("pid") Integer id);
    int deleteAppinfo(@Param("id") Integer id);
    int deleteAppVersion(@Param("appid") Integer appid);
    int updateAppinfo(AppInfo info);//修改app信息
    int updateStatus(@Param("appid") Integer id, @Param("statu") Integer statu);//修改状态
}
