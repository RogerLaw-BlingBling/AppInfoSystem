package com.appinfo.dao;/**

 */

import com.appinfo.entity.AppCategory;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: Huar
 * @create: 2018-05-16 15:01
 **/
@Repository("appCategoryDao")
public interface AppCategoryDao {
    List<AppCategory> getAppCategoryListByParentId(
            @Param("parentId") Integer parentId) throws Exception;
}
