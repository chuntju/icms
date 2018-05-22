package com.cscec.smartbuild.service.impl;

import ch.qos.logback.core.util.StringCollectionUtil;
import com.cscec.smartbuild.dto.BuildingModel;
import com.cscec.smartbuild.dto.RoomModel;
import com.cscec.smartbuild.mapper.BuildingModelMapper;
import com.cscec.smartbuild.mapper.RoomModelMapper;
import com.cscec.smartbuild.service.IRoomService;
import com.cscec.smartbuild.util.StringUtil;
import com.cscec.smartbuild.vo.RoomsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Room service
 *
 * @author wangchun
 * @create 2018-04-18 16:04
 **/
@Service
public class RoomServiceImpl implements IRoomService
{


    @Autowired
    private RoomModelMapper roomMapper;

    @Autowired
    private BuildingModelMapper buildingMapper;

    /**
     * 获取所有的房间信息
     *
     * @return 房间信息列表
     */
    public List<RoomModel> getAllRooms() {
        return roomMapper.selectAllRooms();
    }

    /**
     * 获取所有的房间信息
     *
     * @return 房间信息列表
     */
    public List<RoomModel> getAllRooms(long buildingNo, String floorNo)
    {
         return roomMapper.selectRooms(buildingNo, floorNo);
    }

    public List<BuildingModel> getAllBuildings()
    {
        return buildingMapper.selectAllBuildings();
    }

    public List<String> getAllFloorNos(long buildingNo)
    {
        return buildingMapper.selectFloorNos(buildingNo);
    }
}
