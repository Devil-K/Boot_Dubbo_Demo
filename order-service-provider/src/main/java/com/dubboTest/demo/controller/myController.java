package com.dubboTest.demo.controller;

import com.dubboTest.demo.entity.NeuqUsers;
import com.dubboTest.demo.entity.PlcDevice;
import com.dubboTest.demo.mapper.NeuqUsersMapper;
import com.dubboTest.demo.mapper.PlcDeviceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Auther: jkMa
 * @Date: 2020/4/24 23:38
 * @ItemName: dubboDemo
 */
@Controller
public class myController {

    @Autowired
    PlcDeviceMapper plc;

    @Autowired
    NeuqUsersMapper users;

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        List<PlcDevice> plcDevices = plc.selectAll();
        List<NeuqUsers> neuqUsers = users.selectAll();
        return ";"+plcDevices +"-------------------"+neuqUsers;
    }
}
