package com.appinfo.service.impl;/**

 */

import com.appinfo.dao.AppCategoryDao;
import com.appinfo.entity.AppCategory;
import com.appinfo.service.AppCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: Huar
 * @create: 2018-05-16 15:02
 **/
@Service("appCategoryService")
public class AppCategoryServiceImpl implements AppCategoryService {

    @Resource
    private AppCategoryDao appCategoryDao;

    @Override
    public List<AppCategory> getAppCategoryListByParentId(Integer parentId)
            throws Exception {
        return appCategoryDao.getAppCategoryListByParentId(parentId);
    }
}
