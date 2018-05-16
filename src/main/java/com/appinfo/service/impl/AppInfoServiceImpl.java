package com.appinfo.service.impl;

import com.appinfo.dao.AppInfoDao;
import com.appinfo.entity.AppInfo;
import com.appinfo.service.AppInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("appInfoService")
public class AppInfoServiceImpl implements AppInfoService {


    @Resource(name = "appInfoDao")
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

    @Override
    public int getAppInfoCount(String querySoftwareName, Integer queryStatus,
                               Integer queryCategoryLevel1, Integer queryCategoryLevel2,
                               Integer queryCategoryLevel3, Integer queryFlatformId, Integer devId)
            throws Exception {
        return appInfoDao.getAppInfoCount(querySoftwareName, queryStatus,
                queryCategoryLevel1, queryCategoryLevel2, queryCategoryLevel3,
                queryFlatformId, devId);
    }

    @Override
    public AppInfo getAppinfoId(String id) {
        AppInfo info = null;
        try {
            info = appInfoDao.getAppinfoId(id);
        } catch (Exception e) {
            e.printStackTrace();
            info = null;
        }
        return info;
    }

    @Override
    public boolean addAppinfo(AppInfo in) {
        boolean flag = false;
        try {
            if(appInfoDao.addAppinfo(in)> 0)

                flag = true;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            try {
                System.out.println("rollback==================");
            } catch (Exception e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }
        return flag;
    }

    @Override
    public AppInfo getAppFind(Integer id, String apkName) {
        return appInfoDao.getAppFind(id, apkName);
    }

    @Override
    public boolean deleteAppinfo(int id) {
        boolean falg=false;
        if(appInfoDao.deleteAppVersion(id)>0){
            if(appInfoDao.deleteAppinfo(id)==1){
                falg=true;
            }
        }
        return falg;
    }

    @Override
    public boolean deleteAppVersion(String id) {
        boolean falg=false;
        if(appInfoDao.deleteAppVersion(Integer.parseInt(id))==1){
            falg=true;
        }
        return falg;
    }

    @Override
    public boolean updateAppinfo(AppInfo info) {
        boolean falg=false;
        try {
            if(appInfoDao.updateAppinfo(info)>0){
                falg=true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return falg;
    }

    @Override
    public boolean updateStatus(Integer appid, Integer statu) {
        boolean falg=false;
        if(appInfoDao.updateStatus(appid, statu)==1){
            falg=true;
        }
        return falg;
    }
}