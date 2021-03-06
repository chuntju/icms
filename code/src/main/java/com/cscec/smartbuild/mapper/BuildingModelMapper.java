package com.cscec.smartbuild.mapper;

import com.cscec.smartbuild.dto.BuildingModel;

import java.util.List;

public interface BuildingModelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table building
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    int deleteByPrimaryKey(Long buildingId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table building
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    int insert(BuildingModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table building
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    int insertSelective(BuildingModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table building
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    BuildingModel selectByPrimaryKey(Long buildingId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table building
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    List<BuildingModel> selectAllBuildings();

    List<String> selectFloorNos(long buildingNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table building
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    int updateByPrimaryKeySelective(BuildingModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table building
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    int updateByPrimaryKey(BuildingModel record);
}