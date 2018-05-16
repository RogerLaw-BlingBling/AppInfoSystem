package com.appinfo.service.impl;

import com.appinfo.dao.DataDictionaryDao;
import com.appinfo.entity.DataDictionary;
import com.appinfo.service.DataDictionaryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: ZaiZai
 * @Date: Created in 2018/5/16 17:08
 */

@Service("dataDictionaryService")
public class DataDictionaryServiceImpl implements DataDictionaryService {
    @Resource
    private DataDictionaryDao dataDictionaryDao;
    @Override
    public List<DataDictionary> getDataDictionaryList(String typeCode) throws Exception {
        return dataDictionaryDao.getDataDictionaryList(typeCode);
    }
}
