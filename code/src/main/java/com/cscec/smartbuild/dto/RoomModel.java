package com.cscec.smartbuild.dto;

import java.io.Serializable;
import java.util.Date;

public class RoomModel implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.room_id
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    private Long roomId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.room_no
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    private String roomNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.room_area
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    private Long roomArea;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.room_status
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    private Integer roomStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.room_desc
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    private String roomDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.user_id
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.building_no
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    private String buildingNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.floor_no
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    private String floorNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.creator
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    private String creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.create_time
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.updator
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    private String updator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.update_time
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.update_reason
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    private String updateReason;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table room
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.room_id
     *
     * @return the value of room.room_id
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    public Long getRoomId() {
        return roomId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.room_id
     *
     * @param roomId the value for room.room_id
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.room_no
     *
     * @return the value of room.room_no
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    public String getRoomNo() {
        return roomNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.room_no
     *
     * @param roomNo the value for room.room_no
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo == null ? null : roomNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.room_area
     *
     * @return the value of room.room_area
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    public Long getRoomArea() {
        return roomArea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.room_area
     *
     * @param roomArea the value for room.room_area
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    public void setRoomArea(Long roomArea) {
        this.roomArea = roomArea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.room_status
     *
     * @return the value of room.room_status
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    public Integer getRoomStatus() {
        return roomStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.room_status
     *
     * @param roomStatus the value for room.room_status
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    public void setRoomStatus(Integer roomStatus) {
        this.roomStatus = roomStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.room_desc
     *
     * @return the value of room.room_desc
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    public String getRoomDesc() {
        return roomDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.room_desc
     *
     * @param roomDesc the value for room.room_desc
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    public void setRoomDesc(String roomDesc) {
        this.roomDesc = roomDesc == null ? null : roomDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.user_id
     *
     * @return the value of room.user_id
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.user_id
     *
     * @param userId the value for room.user_id
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.building_no
     *
     * @return the value of room.building_no
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    public String getBuildingNo() {
        return buildingNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.building_no
     *
     * @param buildingNo the value for room.building_no
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    public void setBuildingNo(String buildingNo) {
        this.buildingNo = buildingNo == null ? null : buildingNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.floor_no
     *
     * @return the value of room.floor_no
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    public String getFloorNo() {
        return floorNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.floor_no
     *
     * @param floorNo the value for room.floor_no
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    public void setFloorNo(String floorNo) {
        this.floorNo = floorNo == null ? null : floorNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.creator
     *
     * @return the value of room.creator
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.creator
     *
     * @param creator the value for room.creator
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.create_time
     *
     * @return the value of room.create_time
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.create_time
     *
     * @param createTime the value for room.create_time
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.updator
     *
     * @return the value of room.updator
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    public String getUpdator() {
        return updator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.updator
     *
     * @param updator the value for room.updator
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.update_time
     *
     * @return the value of room.update_time
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.update_time
     *
     * @param updateTime the value for room.update_time
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.update_reason
     *
     * @return the value of room.update_reason
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    public String getUpdateReason() {
        return updateReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.update_reason
     *
     * @param updateReason the value for room.update_reason
     *
     * @mbggenerated Fri Apr 27 14:01:49 CST 2018
     */
    public void setUpdateReason(String updateReason) {
        this.updateReason = updateReason == null ? null : updateReason.trim();
    }
}