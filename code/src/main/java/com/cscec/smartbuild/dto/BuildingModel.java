package com.cscec.smartbuild.dto;

import java.io.Serializable;

public class BuildingModel implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column building.building_id
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    private Long buildingId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column building.building_no
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    private Long buildingNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column building.building_name
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    private String buildingName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column building.building_address
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    private String buildingAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column building.building_desc
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    private String buildingDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column building.floor_no
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    private String floorNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table building
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column building.building_id
     *
     * @return the value of building.building_id
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    public Long getBuildingId() {
        return buildingId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column building.building_id
     *
     * @param buildingId the value for building.building_id
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    public void setBuildingId(Long buildingId) {
        this.buildingId = buildingId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column building.building_no
     *
     * @return the value of building.building_no
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    public Long getBuildingNo() {
        return buildingNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column building.building_no
     *
     * @param buildingNo the value for building.building_no
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    public void setBuildingNo(Long buildingNo) {
        this.buildingNo = buildingNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column building.building_name
     *
     * @return the value of building.building_name
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    public String getBuildingName() {
        return buildingName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column building.building_name
     *
     * @param buildingName the value for building.building_name
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName == null ? null : buildingName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column building.building_address
     *
     * @return the value of building.building_address
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    public String getBuildingAddress() {
        return buildingAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column building.building_address
     *
     * @param buildingAddress the value for building.building_address
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    public void setBuildingAddress(String buildingAddress) {
        this.buildingAddress = buildingAddress == null ? null : buildingAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column building.building_desc
     *
     * @return the value of building.building_desc
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    public String getBuildingDesc() {
        return buildingDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column building.building_desc
     *
     * @param buildingDesc the value for building.building_desc
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    public void setBuildingDesc(String buildingDesc) {
        this.buildingDesc = buildingDesc == null ? null : buildingDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column building.floor_no
     *
     * @return the value of building.floor_no
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    public String getFloorNo() {
        return floorNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column building.floor_no
     *
     * @param floorNo the value for building.floor_no
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    public void setFloorNo(String floorNo) {
        this.floorNo = floorNo == null ? null : floorNo.trim();
    }
}