package com.appinfo.service;

import com.appinfo.entity.DataDictionary;

import java.util.List;

/**
 * @Author: ZaiZai
 * @Date: Created in 2018/5/16 17:05
 */
public interface DataDictionaryService {
    List<DataDictionary> getDataDictionaryList(String typeCode)
            throws Exception;
}
