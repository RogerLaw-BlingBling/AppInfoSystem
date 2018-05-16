package com.appinfo.service.impl;/**

 */

import com.appinfo.dao.AppInfoDao;
import com.appinfo.dao.AppVersionDao;
import com.appinfo.entity.AppVersion;
import com.appinfo.service.AppVersionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

/**
 * @author: Huar
 * @create: 2018-05-16 10:00
 **/
@Service
public class AppVersionServiceImpl implements AppVersionService {

    @Resource
    private AppVersionDao appVersionDao;
    @Resource
    private AppInfoDao appInfoDao;


    @Override
    public boolean add(AppVersion appversion) throws Exception {
        boolean flag = false;
        if(appVersionDao.appversionadd(appversion) > 0){
            flag = true;
        }
        return flag;
    }

    @Override
    public ArrayList<AppVersion> getAppVersionById(Integer appId) throws Exception {
        return appVersionDao.getAppVersionById(appId);
    }

    @Override
    public AppVersion getAppVersionByCon(Integer appId, String versionNo) throws Exception {
                return appVersionDao.getAppVersionByCon(appId, versionNo);
    }

    @Override
    public AppVersion getAppVersionByCom(Integer id) throws Exception {
        return null;
    }

    @Override
    public boolean appversionmodify(AppVersion appversion) throws Exception {
        return false;
    }
//    public boolean add(AppVersion appversion) throws Exception {
//        boolean flag = false;
//        if(versionMapper.appversionadd(appversion) > 0){
//            flag = true;
//        }
//        return flag;
//    }
//
//    public ArrayList<AppVersion> getAppVersionById(Integer appId) throws Exception {
//        // TODO Auto-generated method stub
//        return versionMapper.getAppVersionById(appId);
//    }
//
//    public AppVersion getAppVersionByCon(Integer appId,String versionNo) throws Exception {
//        // TODO Auto-generated method stub
//        return versionMapper.getAppVersionByCon(appId, versionNo);
//    }
//
//    public AppVersion getAppVersionByCom(Integer id) throws Exception {
//        // TODO Auto-generated method stub
//        return versionMapper.getAppVersionByCom(id);
//    }
//
//    public boolean appversionmodify(AppVersion appversion) throws Exception {
//        // TODO Auto-generated method stub
//        boolean flag = false;
//        if(versionMapper.appversionmodify(appversion) > 0)
//            flag = true;
//        return flag;
//    }
}
