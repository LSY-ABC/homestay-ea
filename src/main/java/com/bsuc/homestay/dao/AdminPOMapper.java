package com.bsuc.homestay.dao;

import com.bsuc.homestay.entiy.AdminPO;

public interface AdminPOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbggenerated Sun Apr 12 04:13:09 CST 2020
     */
    int deleteByPrimaryKey(Integer adminId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbggenerated Sun Apr 12 04:13:09 CST 2020
     */
    int insert(AdminPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbggenerated Sun Apr 12 04:13:09 CST 2020
     */
    int insertSelective(AdminPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbggenerated Sun Apr 12 04:13:09 CST 2020
     */
    AdminPO selectByPrimaryKey(Integer adminId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbggenerated Sun Apr 12 04:13:09 CST 2020
     */
    int updateByPrimaryKeySelective(AdminPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbggenerated Sun Apr 12 04:13:09 CST 2020
     */
    int updateByPrimaryKey(AdminPO record);
}