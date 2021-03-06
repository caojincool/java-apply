package com.shop.user.dao.mapper;

import com.shop.user.model.pojo.UserLogin;
import com.shop.user.model.pojo.UserLoginExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface UserLoginMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    int countByExample(UserLoginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    int deleteByExample(UserLoginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    @Delete({
        "delete from user_login",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    @Insert({
        "insert into user_login (user_id, login_from, ",
        "login_tag, ip, login_time, ",
        "logout_time, app, ",
        "app_version, device_os, ",
        "device_os_version, device_token, ",
        "create_time, modified_time)",
        "values (#{userId,jdbcType=BIGINT}, #{loginFrom,jdbcType=INTEGER}, ",
        "#{loginTag,jdbcType=INTEGER}, #{ip,jdbcType=VARCHAR}, #{loginTime,jdbcType=TIMESTAMP}, ",
        "#{logoutTime,jdbcType=TIMESTAMP}, #{app,jdbcType=VARCHAR}, ",
        "#{appVersion,jdbcType=VARCHAR}, #{deviceOs,jdbcType=VARCHAR}, ",
        "#{deviceOsVersion,jdbcType=VARCHAR}, #{deviceToken,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{modifiedTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(UserLogin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    int insertSelective(UserLogin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    List<UserLogin> selectByExample(UserLoginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    @Select({
        "select",
        "id, user_id, login_from, login_tag, ip, login_time, logout_time, app, app_version, ",
        "device_os, device_os_version, device_token, create_time, modified_time",
        "from user_login",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("BaseResultMap")
    UserLogin selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    int updateByExampleSelective(@Param("record") UserLogin record, @Param("example") UserLoginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    int updateByExample(@Param("record") UserLogin record, @Param("example") UserLoginExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    int updateByPrimaryKeySelective(UserLogin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login
     *
     * @mbggenerated Wed Jul 04 09:43:43 CST 2018
     */
    @Update({
        "update user_login",
        "set user_id = #{userId,jdbcType=BIGINT},",
          "login_from = #{loginFrom,jdbcType=INTEGER},",
          "login_tag = #{loginTag,jdbcType=INTEGER},",
          "ip = #{ip,jdbcType=VARCHAR},",
          "login_time = #{loginTime,jdbcType=TIMESTAMP},",
          "logout_time = #{logoutTime,jdbcType=TIMESTAMP},",
          "app = #{app,jdbcType=VARCHAR},",
          "app_version = #{appVersion,jdbcType=VARCHAR},",
          "device_os = #{deviceOs,jdbcType=VARCHAR},",
          "device_os_version = #{deviceOsVersion,jdbcType=VARCHAR},",
          "device_token = #{deviceToken,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "modified_time = #{modifiedTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(UserLogin record);
}