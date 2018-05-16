package com.appinfo.dao;

import com.appinfo.entity.DataDictionary;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: ZaiZai
 * @Date: Created in 2018/5/16 17:02
 */
public interface DataDictionaryDao {

    List<DataDictionary> getDataDictionaryList(
            @Param("typeCode") String typeCode) throws Exception;
}
