package com.shop.web.dao.mapper;

import com.shop.web.model.pojo.SfStyle;
import com.shop.web.model.pojo.SfStyleExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface SfStyleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sf_style
     *
     * @mbggenerated Sun Nov 19 16:13:49 CST 2017
     */
    int countByExample(SfStyleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sf_style
     *
     * @mbggenerated Sun Nov 19 16:13:49 CST 2017
     */
    int deleteByExample(SfStyleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sf_style
     *
     * @mbggenerated Sun Nov 19 16:13:49 CST 2017
     */
    @Delete({
        "delete from sf_style",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sf_style
     *
     * @mbggenerated Sun Nov 19 16:13:49 CST 2017
     */
    @Insert({
        "insert into sf_style (name, sort, ",
        "create_time, update_time, ",
        "note)",
        "values (#{name,jdbcType=VARCHAR}, #{sort,jdbcType=INTEGER}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP}, ",
        "#{note,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(SfStyle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sf_style
     *
     * @mbggenerated Sun Nov 19 16:13:49 CST 2017
     */
    int insertSelective(SfStyle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sf_style
     *
     * @mbggenerated Sun Nov 19 16:13:49 CST 2017
     */
    List<SfStyle> selectByExample(SfStyleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sf_style
     *
     * @mbggenerated Sun Nov 19 16:13:49 CST 2017
     */
    @Select({
        "select",
        "id, name, sort, create_time, update_time, note",
        "from sf_style",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("BaseResultMap")
    SfStyle selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sf_style
     *
     * @mbggenerated Sun Nov 19 16:13:49 CST 2017
     */
    int updateByExampleSelective(@Param("record") SfStyle record, @Param("example") SfStyleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sf_style
     *
     * @mbggenerated Sun Nov 19 16:13:49 CST 2017
     */
    int updateByExample(@Param("record") SfStyle record, @Param("example") SfStyleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sf_style
     *
     * @mbggenerated Sun Nov 19 16:13:49 CST 2017
     */
    int updateByPrimaryKeySelective(SfStyle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sf_style
     *
     * @mbggenerated Sun Nov 19 16:13:49 CST 2017
     */
    @Update({
        "update sf_style",
        "set name = #{name,jdbcType=VARCHAR},",
          "sort = #{sort,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "note = #{note,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(SfStyle record);
}