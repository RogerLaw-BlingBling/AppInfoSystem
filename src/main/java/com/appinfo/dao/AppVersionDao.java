package com.appinfo.dao;/**

 */

import com.appinfo.entity.AppVersion;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Huar
 * @create: 2018-05-16 10:03
 **/
@Repository("appVersionDao")
public interface AppVersionDao {
    int addVersion(AppVersion ve);// 新增版本
    List<AppVersion> getAppVersionId(@Param("appId") Integer appId);//根据appid
    AppVersion getVerSionId(@Param("id") Integer id);//根据版本id
    int updateVersion(AppVersion in);//修改版本
}
