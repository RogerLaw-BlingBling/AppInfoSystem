package com.appinfo.dao;

import com.appinfo.entity.DevUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository("devuserDao")
public interface DevUserDao {
    DevUser getBydevCode(@Param("devCode")String devCode);


}
