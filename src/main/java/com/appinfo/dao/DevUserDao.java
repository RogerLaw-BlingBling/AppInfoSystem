package com.appinfo.dao;

import com.appinfo.entity.DevUser;
import org.apache.ibatis.annotations.Param;

public interface DevUserDao {
      DevUser getBydevCode(@Param("devCode")String devCode);

    String queryUser(DevUser user);
}
