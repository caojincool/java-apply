package com.shop.user.model.pojo;

import java.util.Date;

public class ShopUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_user.id
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_user.name
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_user.nick_name
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    private String nickName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_user.sex
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    private Integer sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_user.mobile
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    private String mobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_user.statu
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    private Integer statu;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_user.reg_comefrom
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    private Integer regComefrom;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_user.reg_time
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    private Date regTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_user.last_login_id
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    private Long lastLoginId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_user.last_login_time
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    private Date lastLoginTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_user.token
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    private String token;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_user.token_expire_time
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    private Date tokenExpireTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_user.app
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    private String app;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_user.app_version
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    private String appVersion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_user.device_os
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    private String deviceOs;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_user.device_os_version
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    private String deviceOsVersion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_user.device_token
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    private String deviceToken;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_user.create_time
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_user.modified_time
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    private Date modifiedTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_user.id
     *
     * @return the value of shop_user.id
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_user.id
     *
     * @param id the value for shop_user.id
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_user.name
     *
     * @return the value of shop_user.name
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_user.name
     *
     * @param name the value for shop_user.name
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_user.nick_name
     *
     * @return the value of shop_user.nick_name
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_user.nick_name
     *
     * @param nickName the value for shop_user.nick_name
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_user.sex
     *
     * @return the value of shop_user.sex
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_user.sex
     *
     * @param sex the value for shop_user.sex
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_user.mobile
     *
     * @return the value of shop_user.mobile
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_user.mobile
     *
     * @param mobile the value for shop_user.mobile
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_user.statu
     *
     * @return the value of shop_user.statu
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    public Integer getStatu() {
        return statu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_user.statu
     *
     * @param statu the value for shop_user.statu
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    public void setStatu(Integer statu) {
        this.statu = statu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_user.reg_comefrom
     *
     * @return the value of shop_user.reg_comefrom
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    public Integer getRegComefrom() {
        return regComefrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_user.reg_comefrom
     *
     * @param regComefrom the value for shop_user.reg_comefrom
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    public void setRegComefrom(Integer regComefrom) {
        this.regComefrom = regComefrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_user.reg_time
     *
     * @return the value of shop_user.reg_time
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    public Date getRegTime() {
        return regTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_user.reg_time
     *
     * @param regTime the value for shop_user.reg_time
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_user.last_login_id
     *
     * @return the value of shop_user.last_login_id
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    public Long getLastLoginId() {
        return lastLoginId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_user.last_login_id
     *
     * @param lastLoginId the value for shop_user.last_login_id
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    public void setLastLoginId(Long lastLoginId) {
        this.lastLoginId = lastLoginId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_user.last_login_time
     *
     * @return the value of shop_user.last_login_time
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_user.last_login_time
     *
     * @param lastLoginTime the value for shop_user.last_login_time
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_user.token
     *
     * @return the value of shop_user.token
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    public String getToken() {
        return token;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_user.token
     *
     * @param token the value for shop_user.token
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_user.token_expire_time
     *
     * @return the value of shop_user.token_expire_time
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    public Date getTokenExpireTime() {
        return tokenExpireTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_user.token_expire_time
     *
     * @param tokenExpireTime the value for shop_user.token_expire_time
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    public void setTokenExpireTime(Date tokenExpireTime) {
        this.tokenExpireTime = tokenExpireTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_user.app
     *
     * @return the value of shop_user.app
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    public String getApp() {
        return app;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_user.app
     *
     * @param app the value for shop_user.app
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    public void setApp(String app) {
        this.app = app == null ? null : app.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_user.app_version
     *
     * @return the value of shop_user.app_version
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    public String getAppVersion() {
        return appVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_user.app_version
     *
     * @param appVersion the value for shop_user.app_version
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion == null ? null : appVersion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_user.device_os
     *
     * @return the value of shop_user.device_os
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    public String getDeviceOs() {
        return deviceOs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_user.device_os
     *
     * @param deviceOs the value for shop_user.device_os
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    public void setDeviceOs(String deviceOs) {
        this.deviceOs = deviceOs == null ? null : deviceOs.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_user.device_os_version
     *
     * @return the value of shop_user.device_os_version
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    public String getDeviceOsVersion() {
        return deviceOsVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_user.device_os_version
     *
     * @param deviceOsVersion the value for shop_user.device_os_version
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    public void setDeviceOsVersion(String deviceOsVersion) {
        this.deviceOsVersion = deviceOsVersion == null ? null : deviceOsVersion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_user.device_token
     *
     * @return the value of shop_user.device_token
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    public String getDeviceToken() {
        return deviceToken;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_user.device_token
     *
     * @param deviceToken the value for shop_user.device_token
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken == null ? null : deviceToken.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_user.create_time
     *
     * @return the value of shop_user.create_time
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_user.create_time
     *
     * @param createTime the value for shop_user.create_time
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_user.modified_time
     *
     * @return the value of shop_user.modified_time
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_user.modified_time
     *
     * @param modifiedTime the value for shop_user.modified_time
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}