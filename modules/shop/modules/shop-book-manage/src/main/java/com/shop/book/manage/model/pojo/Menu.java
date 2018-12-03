package com.shop.book.manage.model.pojo;

import java.util.Date;

public class Menu {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.id
     *
     * @mbggenerated Sat Dec 01 14:09:51 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.name
     *
     * @mbggenerated Sat Dec 01 14:09:51 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.url
     *
     * @mbggenerated Sat Dec 01 14:09:51 CST 2018
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.perms
     *
     * @mbggenerated Sat Dec 01 14:09:51 CST 2018
     */
    private String perms;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.parent_id
     *
     * @mbggenerated Sat Dec 01 14:09:51 CST 2018
     */
    private Long parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.type
     *
     * @mbggenerated Sat Dec 01 14:09:51 CST 2018
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.icon
     *
     * @mbggenerated Sat Dec 01 14:09:51 CST 2018
     */
    private String icon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.sort
     *
     * @mbggenerated Sat Dec 01 14:09:51 CST 2018
     */
    private Integer sort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.nav
     *
     * @mbggenerated Sat Dec 01 14:09:51 CST 2018
     */
    private Integer nav;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.create_time
     *
     * @mbggenerated Sat Dec 01 14:09:51 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.modified_time
     *
     * @mbggenerated Sat Dec 01 14:09:51 CST 2018
     */
    private Date modifiedTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.id
     *
     * @return the value of menu.id
     *
     * @mbggenerated Sat Dec 01 14:09:51 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.id
     *
     * @param id the value for menu.id
     *
     * @mbggenerated Sat Dec 01 14:09:51 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.name
     *
     * @return the value of menu.name
     *
     * @mbggenerated Sat Dec 01 14:09:51 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.name
     *
     * @param name the value for menu.name
     *
     * @mbggenerated Sat Dec 01 14:09:51 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.url
     *
     * @return the value of menu.url
     *
     * @mbggenerated Sat Dec 01 14:09:51 CST 2018
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.url
     *
     * @param url the value for menu.url
     *
     * @mbggenerated Sat Dec 01 14:09:51 CST 2018
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.perms
     *
     * @return the value of menu.perms
     *
     * @mbggenerated Sat Dec 01 14:09:51 CST 2018
     */
    public String getPerms() {
        return perms;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.perms
     *
     * @param perms the value for menu.perms
     *
     * @mbggenerated Sat Dec 01 14:09:51 CST 2018
     */
    public void setPerms(String perms) {
        this.perms = perms == null ? null : perms.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.parent_id
     *
     * @return the value of menu.parent_id
     *
     * @mbggenerated Sat Dec 01 14:09:51 CST 2018
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.parent_id
     *
     * @param parentId the value for menu.parent_id
     *
     * @mbggenerated Sat Dec 01 14:09:51 CST 2018
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.type
     *
     * @return the value of menu.type
     *
     * @mbggenerated Sat Dec 01 14:09:51 CST 2018
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.type
     *
     * @param type the value for menu.type
     *
     * @mbggenerated Sat Dec 01 14:09:51 CST 2018
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.icon
     *
     * @return the value of menu.icon
     *
     * @mbggenerated Sat Dec 01 14:09:51 CST 2018
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.icon
     *
     * @param icon the value for menu.icon
     *
     * @mbggenerated Sat Dec 01 14:09:51 CST 2018
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.sort
     *
     * @return the value of menu.sort
     *
     * @mbggenerated Sat Dec 01 14:09:51 CST 2018
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.sort
     *
     * @param sort the value for menu.sort
     *
     * @mbggenerated Sat Dec 01 14:09:51 CST 2018
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.nav
     *
     * @return the value of menu.nav
     *
     * @mbggenerated Sat Dec 01 14:09:51 CST 2018
     */
    public Integer getNav() {
        return nav;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.nav
     *
     * @param nav the value for menu.nav
     *
     * @mbggenerated Sat Dec 01 14:09:51 CST 2018
     */
    public void setNav(Integer nav) {
        this.nav = nav;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.create_time
     *
     * @return the value of menu.create_time
     *
     * @mbggenerated Sat Dec 01 14:09:51 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.create_time
     *
     * @param createTime the value for menu.create_time
     *
     * @mbggenerated Sat Dec 01 14:09:51 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.modified_time
     *
     * @return the value of menu.modified_time
     *
     * @mbggenerated Sat Dec 01 14:09:51 CST 2018
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.modified_time
     *
     * @param modifiedTime the value for menu.modified_time
     *
     * @mbggenerated Sat Dec 01 14:09:51 CST 2018
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}