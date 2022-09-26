package com.D.crm.workbench.transaction.mapper;

import com.D.crm.workbench.transaction.model.Transaction;
import com.D.crm.workbench.transaction.model.TransactionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransactionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_tran
     *
     * @mbggenerated Sun Sep 25 18:52:55 CST 2022
     */
    int countByExample(TransactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_tran
     *
     * @mbggenerated Sun Sep 25 18:52:55 CST 2022
     */
    int deleteByExample(TransactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_tran
     *
     * @mbggenerated Sun Sep 25 18:52:55 CST 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_tran
     *
     * @mbggenerated Sun Sep 25 18:52:55 CST 2022
     */
    int insert(Transaction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_tran
     *
     * @mbggenerated Sun Sep 25 18:52:55 CST 2022
     */
    int insertSelective(Transaction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_tran
     *
     * @mbggenerated Sun Sep 25 18:52:55 CST 2022
     */
    List<Transaction> selectByExample(TransactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_tran
     *
     * @mbggenerated Sun Sep 25 18:52:55 CST 2022
     */
    Transaction selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_tran
     *
     * @mbggenerated Sun Sep 25 18:52:55 CST 2022
     */
    int updateByExampleSelective(@Param("record") Transaction record, @Param("example") TransactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_tran
     *
     * @mbggenerated Sun Sep 25 18:52:55 CST 2022
     */
    int updateByExample(@Param("record") Transaction record, @Param("example") TransactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_tran
     *
     * @mbggenerated Sun Sep 25 18:52:55 CST 2022
     */
    int updateByPrimaryKeySelective(Transaction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_tran
     *
     * @mbggenerated Sun Sep 25 18:52:55 CST 2022
     */
    int updateByPrimaryKey(Transaction record);
}