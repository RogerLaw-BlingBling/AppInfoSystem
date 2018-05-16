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
    @Resource(name = "appInfoDao")
    private AppInfoDao appInfoDao;

}