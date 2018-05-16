package com.appinfo.controller;

import com.appinfo.entity.AppCategory;
import com.appinfo.entity.AppInfo;
import com.appinfo.entity.BackendUser;
import com.appinfo.entity.DataDictionary;
import com.appinfo.service.AppCategoryService;
import com.appinfo.service.AppInfoService;
import com.appinfo.service.DataDictionaryService;
import com.appinfo.tools.Constants;
import com.appinfo.tools.PageSupport;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author: Huar
 * @create: 2018-05-14 11:00
 **/

@Controller
@RequestMapping("/AppInfo")
public class AppInfoController {

    private Logger logger = Logger.getLogger(AppInfoController.class);

    @Resource(name = "appInfoService")
    private AppInfoService appInfoService;

    @Resource(name = "dataDictionaryService")
    private DataDictionaryService dataDictionaryService;

    @Resource(name = "appCategoryService")
    private AppCategoryService appCategoryService;

    public List<DataDictionary> getDataDictionaryList(String typeCode) {
        List<DataDictionary> dataDictionaryList = null;
        try {
            dataDictionaryList = dataDictionaryService
                    .getDataDictionaryList(typeCode);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataDictionaryList;
    }
    // 获取类型列表

    public List<AppCategory> getCategoryList(String pid) {
        List<AppCategory> categoryLevelList = null;
        try {
            categoryLevelList = appCategoryService
                    .getAppCategoryListByParentId(pid == null ? null : Integer
                            .parseInt(pid));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return categoryLevelList;
    }


    @RequestMapping(value = "/Backendlist")
    public String getBackendAppInfoList(
            Model model, HttpSession session,
            @RequestParam(value = "querySoftwareName", required = false) String querySoftwareName,
            @RequestParam(value = "queryStatus", required = false) String _queryStatus,
            @RequestParam(value = "queryCategoryLevel1", required = false) String _queryCategoryLevel1,
            @RequestParam(value = "queryCategoryLevel2", required = false) String _queryCategoryLevel2,
            @RequestParam(value = "queryCategoryLevel3", required = false) String _queryCategoryLevel3,
            @RequestParam(value = "queryFlatformId", required = false) String _queryFlatformId,
            @RequestParam(value = "pageIndex", required = false) String pageIndex) {
        logger.info("getAppInfoList -- > querySoftwareName: "
                + querySoftwareName);
        logger.info("getAppInfoList -- > queryStatus: " + _queryStatus);
        logger.info("getAppInfoList -- > queryCategoryLevel1: "
                + _queryCategoryLevel1);
        logger.info("getAppInfoList -- > queryCategoryLevel2: "
                + _queryCategoryLevel2);
        logger.info("getAppInfoList -- > queryCategoryLevel3: "
                + _queryCategoryLevel3);
        logger.info("getAppInfoList -- > queryFlatformId: " + _queryFlatformId);
        logger.info("getAppInfoList -- > pageIndex: " + pageIndex);

        Integer devId = ((BackendUser) session
                .getAttribute("backendUser")).getId();
        List<AppInfo> appInfoList = null;
        List<DataDictionary> statusList = null;
        List<DataDictionary> flatFormList = null;
        List<AppCategory> categoryLevel1List = null;
        List<AppCategory> categoryLevel2List = null;
        List<AppCategory> categoryLevel3List = null;
        // 页面容量
        int pageSize = Constants.pageSize;
        // 当前页码
        Integer currentPageNo = 1;

        if (pageIndex != null) {
            try {
                currentPageNo = Integer.valueOf(pageIndex);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        Integer queryStatus = null;
        if (_queryStatus != null && !_queryStatus.equals("")) {
            queryStatus = Integer.parseInt(_queryStatus);
        }
        Integer queryCategoryLevel1 = null;
        if (_queryCategoryLevel1 != null && !_queryCategoryLevel1.equals("")) {
            queryCategoryLevel1 = Integer.parseInt(_queryCategoryLevel1);
        }
        Integer queryCategoryLevel2 = null;
        if (_queryCategoryLevel2 != null && !_queryCategoryLevel2.equals("")) {
            queryCategoryLevel2 = Integer.parseInt(_queryCategoryLevel2);
        }
        Integer queryCategoryLevel3 = null;
        if (_queryCategoryLevel3 != null && !_queryCategoryLevel3.equals("")) {
            queryCategoryLevel3 = Integer.parseInt(_queryCategoryLevel3);
        }
        Integer queryFlatformId = null;
        if (_queryFlatformId != null && !_queryFlatformId.equals("")) {
            queryFlatformId = Integer.parseInt(_queryFlatformId);
        }

        // 总数量（表）
        int totalCount = 0;
        try {
            totalCount = appInfoService.getAppInfoCount(querySoftwareName,
                    queryStatus, queryCategoryLevel1, queryCategoryLevel2,
                    queryCategoryLevel3, queryFlatformId, devId);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 总页数
        PageSupport pages = new PageSupport();
        pages.setCurrentPageNo(currentPageNo);
        pages.setPageSize(pageSize);
        pages.setTotalCount(totalCount);
        int totalPageCount = pages.getTotalPageCount();
        // 控制首页和尾页
        if (currentPageNo < 1) {
            currentPageNo = 1;
        } else if (currentPageNo > totalPageCount) {
            currentPageNo = totalPageCount;
        }
        try {
            appInfoList = appInfoService.getAppInfoList(querySoftwareName,
                    queryStatus, queryCategoryLevel1, queryCategoryLevel2,
                    queryCategoryLevel3, queryFlatformId, devId, currentPageNo,
                    pageSize);
            // 获取相应词典列表
            statusList = this.getDataDictionaryList("APP_STATUS");
            flatFormList = this.getDataDictionaryList("APP_FLATFORM");
            categoryLevel1List = appCategoryService
                    .getAppCategoryListByParentId(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("appInfoList", appInfoList);
        model.addAttribute("statusList", statusList);
        model.addAttribute("flatFormList", flatFormList);
        model.addAttribute("categoryLevel1List", categoryLevel1List);
        model.addAttribute("pages", pages);
        model.addAttribute("queryStatus", queryStatus);
        model.addAttribute("querySoftwareName", querySoftwareName);
        model.addAttribute("queryCategoryLevel1", queryCategoryLevel1);
        model.addAttribute("queryCategoryLevel2", queryCategoryLevel2);
        model.addAttribute("queryCategoryLevel3", queryCategoryLevel3);
        model.addAttribute("queryFlatformId", queryFlatformId);

        if (queryCategoryLevel2 != null && !queryCategoryLevel2.equals("")) {
            categoryLevel2List = getCategoryList(queryCategoryLevel1.toString());
            model.addAttribute("categoryLevel2List", categoryLevel2List);
        }
        if (queryCategoryLevel3 != null && !queryCategoryLevel3.equals("")) {
            categoryLevel3List = getCategoryList(queryCategoryLevel2.toString());
            model.addAttribute("categoryLevel3List", categoryLevel3List);
        }
        return "backend/applist";
    }
}




