package com.dubboTest.demo.controller;

import com.Demo.dubbo.bean.UserAddress;
import com.Demo.dubbo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Auther: jkMa
 * @Date: 2020/3/31 21:34
 * @ItemName: dubboDemo
 */
@Controller
public class OrderController {
    @Autowired
    OrderService orderService;

    @ResponseBody
    @RequestMapping("/initOrder")
    public List<UserAddress> initOrder(@RequestParam("uid")String userId) {
        System.out.print("huoqu");
        return orderService.initOrder(userId);
    }
    //測試的地址
    @RequestMapping("/hello")
    public String hello() {
        System.out.print("-=============---=-=-huoqu");
        String userId="998";
        //return orderService.initOrder(userId);
        return "hello1";

    }
}
