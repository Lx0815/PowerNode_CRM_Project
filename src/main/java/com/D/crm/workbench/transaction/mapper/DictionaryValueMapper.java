package com.D.crm.workbench.transaction.mapper;

import com.D.crm.workbench.transaction.model.DictionaryValue;
import com.D.crm.workbench.transaction.model.DictionaryValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictionaryValueMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_dic_value
     *
     * @mbggenerated Sun Sep 25 18:52:55 CST 2022
     */
    int countByExample(DictionaryValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_dic_value
     *
     * @mbggenerated Sun Sep 25 18:52:55 CST 2022
     */
    int deleteByExample(DictionaryValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_dic_value
     *
     * @mbggenerated Sun Sep 25 18:52:55 CST 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_dic_value
     *
     * @mbggenerated Sun Sep 25 18:52:55 CST 2022
     */
    int insert(DictionaryValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_dic_value
     *
     * @mbggenerated Sun Sep 25 18:52:55 CST 2022
     */
    int insertSelective(DictionaryValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_dic_value
     *
     * @mbggenerated Sun Sep 25 18:52:55 CST 2022
     */
    List<DictionaryValue> selectByExample(DictionaryValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_dic_value
     *
     * @mbggenerated Sun Sep 25 18:52:55 CST 2022
     */
    DictionaryValue selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_dic_value
     *
     * @mbggenerated Sun Sep 25 18:52:55 CST 2022
     */
    int updateByExampleSelective(@Param("record") DictionaryValue record, @Param("example") DictionaryValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_dic_value
     *
     * @mbggenerated Sun Sep 25 18:52:55 CST 2022
     */
    int updateByExample(@Param("record") DictionaryValue record, @Param("example") DictionaryValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_dic_value
     *
     * @mbggenerated Sun Sep 25 18:52:55 CST 2022
     */
    int updateByPrimaryKeySelective(DictionaryValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_dic_value
     *
     * @mbggenerated Sun Sep 25 18:52:55 CST 2022
     */
    int updateByPrimaryKey(DictionaryValue record);
}