package com.shop.book.manage.model.pojo.shop;

import com.shop.base.model.BasePojo;
import java.util.Date;

public class Dict extends BasePojo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict.id
     *
     * @mbggenerated Fri Dec 28 13:48:45 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict.dict_key
     *
     * @mbggenerated Fri Dec 28 13:48:45 CST 2018
     */
    private String dictKey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict.dict_label
     *
     * @mbggenerated Fri Dec 28 13:48:45 CST 2018
     */
    private String dictLabel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict.dict_value
     *
     * @mbggenerated Fri Dec 28 13:48:45 CST 2018
     */
    private String dictValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict.dict_ext
     *
     * @mbggenerated Fri Dec 28 13:48:45 CST 2018
     */
    private String dictExt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict.dict_type
     *
     * @mbggenerated Fri Dec 28 13:48:45 CST 2018
     */
    private Integer dictType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict.dict_type_name
     *
     * @mbggenerated Fri Dec 28 13:48:45 CST 2018
     */
    private String dictTypeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict.is_use
     *
     * @mbggenerated Fri Dec 28 13:48:45 CST 2018
     */
    private Integer isUse;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict.sort
     *
     * @mbggenerated Fri Dec 28 13:48:45 CST 2018
     */
    private Integer sort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict.create_time
     *
     * @mbggenerated Fri Dec 28 13:48:45 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dict.modified_time
     *
     * @mbggenerated Fri Dec 28 13:48:45 CST 2018
     */
    private Date modifiedTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict.id
     *
     * @return the value of dict.id
     *
     * @mbggenerated Fri Dec 28 13:48:45 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict.id
     *
     * @param id the value for dict.id
     *
     * @mbggenerated Fri Dec 28 13:48:45 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict.dict_key
     *
     * @return the value of dict.dict_key
     *
     * @mbggenerated Fri Dec 28 13:48:45 CST 2018
     */
    public String getDictKey() {
        return dictKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict.dict_key
     *
     * @param dictKey the value for dict.dict_key
     *
     * @mbggenerated Fri Dec 28 13:48:45 CST 2018
     */
    public void setDictKey(String dictKey) {
        this.dictKey = dictKey == null ? null : dictKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict.dict_label
     *
     * @return the value of dict.dict_label
     *
     * @mbggenerated Fri Dec 28 13:48:45 CST 2018
     */
    public String getDictLabel() {
        return dictLabel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict.dict_label
     *
     * @param dictLabel the value for dict.dict_label
     *
     * @mbggenerated Fri Dec 28 13:48:45 CST 2018
     */
    public void setDictLabel(String dictLabel) {
        this.dictLabel = dictLabel == null ? null : dictLabel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict.dict_value
     *
     * @return the value of dict.dict_value
     *
     * @mbggenerated Fri Dec 28 13:48:45 CST 2018
     */
    public String getDictValue() {
        return dictValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict.dict_value
     *
     * @param dictValue the value for dict.dict_value
     *
     * @mbggenerated Fri Dec 28 13:48:45 CST 2018
     */
    public void setDictValue(String dictValue) {
        this.dictValue = dictValue == null ? null : dictValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict.dict_ext
     *
     * @return the value of dict.dict_ext
     *
     * @mbggenerated Fri Dec 28 13:48:45 CST 2018
     */
    public String getDictExt() {
        return dictExt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict.dict_ext
     *
     * @param dictExt the value for dict.dict_ext
     *
     * @mbggenerated Fri Dec 28 13:48:45 CST 2018
     */
    public void setDictExt(String dictExt) {
        this.dictExt = dictExt == null ? null : dictExt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict.dict_type
     *
     * @return the value of dict.dict_type
     *
     * @mbggenerated Fri Dec 28 13:48:45 CST 2018
     */
    public Integer getDictType() {
        return dictType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict.dict_type
     *
     * @param dictType the value for dict.dict_type
     *
     * @mbggenerated Fri Dec 28 13:48:45 CST 2018
     */
    public void setDictType(Integer dictType) {
        this.dictType = dictType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict.dict_type_name
     *
     * @return the value of dict.dict_type_name
     *
     * @mbggenerated Fri Dec 28 13:48:45 CST 2018
     */
    public String getDictTypeName() {
        return dictTypeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict.dict_type_name
     *
     * @param dictTypeName the value for dict.dict_type_name
     *
     * @mbggenerated Fri Dec 28 13:48:45 CST 2018
     */
    public void setDictTypeName(String dictTypeName) {
        this.dictTypeName = dictTypeName == null ? null : dictTypeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict.is_use
     *
     * @return the value of dict.is_use
     *
     * @mbggenerated Fri Dec 28 13:48:45 CST 2018
     */
    public Integer getIsUse() {
        return isUse;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict.is_use
     *
     * @param isUse the value for dict.is_use
     *
     * @mbggenerated Fri Dec 28 13:48:45 CST 2018
     */
    public void setIsUse(Integer isUse) {
        this.isUse = isUse;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict.sort
     *
     * @return the value of dict.sort
     *
     * @mbggenerated Fri Dec 28 13:48:45 CST 2018
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict.sort
     *
     * @param sort the value for dict.sort
     *
     * @mbggenerated Fri Dec 28 13:48:45 CST 2018
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict.create_time
     *
     * @return the value of dict.create_time
     *
     * @mbggenerated Fri Dec 28 13:48:45 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict.create_time
     *
     * @param createTime the value for dict.create_time
     *
     * @mbggenerated Fri Dec 28 13:48:45 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dict.modified_time
     *
     * @return the value of dict.modified_time
     *
     * @mbggenerated Fri Dec 28 13:48:45 CST 2018
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dict.modified_time
     *
     * @param modifiedTime the value for dict.modified_time
     *
     * @mbggenerated Fri Dec 28 13:48:45 CST 2018
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}