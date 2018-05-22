package com.cscec.smartbuild.controller;

import com.cscec.smartbuild.dto.RoomModel;
import com.cscec.smartbuild.service.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 主接口controller
 *
 * @author wangchun
 * @create 2018-04-17 15:49
 **/
@Controller
@RequestMapping("/base")
public class MainController {

    @Autowired
    private IRoomService roomService;
    /**
     * 获取所有的房间信息
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/room", method = RequestMethod.GET)
    public String getRoomDetails (Model model)
    {
        List<RoomModel> roomList = roomService.getAllRooms();
        model.addAttribute("list", roomList);

        return "room_select";
    }

}
