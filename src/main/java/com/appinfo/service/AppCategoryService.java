package com.appinfo.service;/**

 */

import com.appinfo.entity.AppCategory;

import java.util.List;

/**
 * @author: Huar
 * @create: 2018-05-16 14:45
 **/
public interface AppCategoryService {
    /**
     * 根据父节点parentId获取相应的分类列表
     *
     * @param parentId
     * @return
     * @throws Exception
     */
    public List<AppCategory> getAppCategoryListByParentId(Integer parentId)
            throws Exception;
}
