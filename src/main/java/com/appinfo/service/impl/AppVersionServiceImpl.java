package com.appinfo.service.impl;/**

 */

import com.appinfo.dao.AppInfoDao;
import com.appinfo.dao.AppVersionDao;
import com.appinfo.entity.AppVersion;
import com.appinfo.service.AppVersionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Huar
 * @create: 2018-05-16 10:00
 **/
@Service
public class AppVersionServiceImpl implements AppVersionService {
    @Resource
    public AppVersionDao version;
    @Resource
    public AppInfoDao info;

    @Override
    public boolean addVersion(AppVersion av) {
        boolean falg=false;
        try {
            if(version.addVersion(av)>0){
                if(info.updateVersionId(av.getId(),av.getAppId())==1){
                    falg=true;
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
            try {
                System.out.println("rollback==================");
            } catch (Exception e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }
        return falg;
    }

    @Override
    public List<AppVersion> getAppVersionId(Integer id) {
        return version.getAppVersionId(id);
    }

    @Override
    public AppVersion getVerSionId(Integer id) {
        return version.getVerSionId(id);
    }

    @Override
    public boolean updateVersion(AppVersion in) {
        boolean falg=false;
        try {
            if(version.updateVersion(in)>0){
                falg=true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return falg;
    }

}

