package com.appinfo.dao;

import com.appinfo.entity.BackendUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Author: ZaiZai
 * @Date: Created in 2018/5/14 22:22
 */

@Repository("backendUserDao")
public interface BackendUserDao {

    BackendUser getBenkendLogin(@Param("userCode") String userCode);

}
