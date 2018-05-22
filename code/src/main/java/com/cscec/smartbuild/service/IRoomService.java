package com.cscec.smartbuild.service;

import com.cscec.smartbuild.dto.RoomModel;

import java.util.List;

public interface IRoomService
{
    /**
     * 获取所有的房间信息
     *
     * @return 房间列表
     */
    public List<RoomModel> getAllRooms ();
}
