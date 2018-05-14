package com.appinfo.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: ZaiZai
 * @Date: Created in 2018/5/14 21:00
 */
public class AppVersion {

    private Integer id;
    private Integer appId;
    private String versionNo;
    private String versionInfo;
    private Integer publishStatus;
    private String downloadLink;
    private BigDecimal versionSize;     //版本大小 单位m
    private Integer createdBy;      //创建者
    private Date creationDate;
    private Integer modifyBy;
    private Date modifyDate;
    private String apkLocPath;      //apk文件的服务器储存路径
    private String apkFileName;     //上传的apk文件名称

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(String versionNo) {
        this.versionNo = versionNo;
    }

    public String getVersionInfo() {
        return versionInfo;
    }

    public void setVersionInfo(String versionInfo) {
        this.versionInfo = versionInfo;
    }

    public Integer getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(Integer publishStatus) {
        this.publishStatus = publishStatus;
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }

    public BigDecimal getVersionSize() {
        return versionSize;
    }

    public void setVersionSize(BigDecimal versionSize) {
        this.versionSize = versionSize;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(Integer modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getApkLocPath() {
        return apkLocPath;
    }

    public void setApkLocPath(String apkLocPath) {
        this.apkLocPath = apkLocPath;
    }

    public String getApkFileName() {
        return apkFileName;
    }

    public void setApkFileName(String apkFileName) {
        this.apkFileName = apkFileName;
    }


    public AppVersion(Integer id, Integer appId, String versionNo, String versionInfo, Integer publishStatus, String downloadLink, BigDecimal versionSize, Integer createdBy, Date creationDate, Integer modifyBy, Date modifyDate, String apkLocPath, String apkFileName) {
        this.id = id;
        this.appId = appId;
        this.versionNo = versionNo;
        this.versionInfo = versionInfo;
        this.publishStatus = publishStatus;
        this.downloadLink = downloadLink;
        this.versionSize = versionSize;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.modifyBy = modifyBy;
        this.modifyDate = modifyDate;
        this.apkLocPath = apkLocPath;
        this.apkFileName = apkFileName;
    }

    public AppVersion() {
    }

    @Override
    public String toString() {
        return "AppVersion{" +
                "id=" + id +
                ", appId=" + appId +
                ", versionNo='" + versionNo + '\'' +
                ", versionInfo='" + versionInfo + '\'' +
                ", publishStatus=" + publishStatus +
                ", downloadLink='" + downloadLink + '\'' +
                ", versionSize=" + versionSize +
                ", createdBy=" + createdBy +
                ", creationDate=" + creationDate +
                ", modifyBy=" + modifyBy +
                ", modifyDate=" + modifyDate +
                ", apkLocPath='" + apkLocPath + '\'' +
                ", apkFileName='" + apkFileName + '\'' +
                '}';
    }
}
