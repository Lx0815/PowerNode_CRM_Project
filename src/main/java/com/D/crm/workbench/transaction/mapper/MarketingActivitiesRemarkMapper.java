package com.D.crm.workbench.transaction.mapper;

import com.D.crm.workbench.transaction.model.MarketingActivitiesRemark;
import com.D.crm.workbench.transaction.model.MarketingActivitiesRemarkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketingActivitiesRemarkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity_remark
     *
     * @mbggenerated Sun Sep 25 18:52:55 CST 2022
     */
    int countByExample(MarketingActivitiesRemarkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity_remark
     *
     * @mbggenerated Sun Sep 25 18:52:55 CST 2022
     */
    int deleteByExample(MarketingActivitiesRemarkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity_remark
     *
     * @mbggenerated Sun Sep 25 18:52:55 CST 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity_remark
     *
     * @mbggenerated Sun Sep 25 18:52:55 CST 2022
     */
    int insert(MarketingActivitiesRemark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity_remark
     *
     * @mbggenerated Sun Sep 25 18:52:55 CST 2022
     */
    int insertSelective(MarketingActivitiesRemark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity_remark
     *
     * @mbggenerated Sun Sep 25 18:52:55 CST 2022
     */
    List<MarketingActivitiesRemark> selectByExample(MarketingActivitiesRemarkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity_remark
     *
     * @mbggenerated Sun Sep 25 18:52:55 CST 2022
     */
    MarketingActivitiesRemark selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity_remark
     *
     * @mbggenerated Sun Sep 25 18:52:55 CST 2022
     */
    int updateByExampleSelective(@Param("record") MarketingActivitiesRemark record, @Param("example") MarketingActivitiesRemarkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity_remark
     *
     * @mbggenerated Sun Sep 25 18:52:55 CST 2022
     */
    int updateByExample(@Param("record") MarketingActivitiesRemark record, @Param("example") MarketingActivitiesRemarkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity_remark
     *
     * @mbggenerated Sun Sep 25 18:52:55 CST 2022
     */
    int updateByPrimaryKeySelective(MarketingActivitiesRemark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity_remark
     *
     * @mbggenerated Sun Sep 25 18:52:55 CST 2022
     */
    int updateByPrimaryKey(MarketingActivitiesRemark record);
}