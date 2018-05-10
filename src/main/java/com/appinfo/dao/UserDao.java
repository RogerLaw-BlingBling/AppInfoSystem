package com.appinfo.dao;

import com.appinfo.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
      User getBydevCode(@Param("devCode")String devCode);

}
