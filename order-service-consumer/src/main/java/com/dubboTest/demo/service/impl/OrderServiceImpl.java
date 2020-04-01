package com.dubboTest.demo.service.impl;

import com.Demo.dubbo.bean.UserAddress;
import com.Demo.dubbo.service.OrderService;
import com.Demo.dubbo.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Auther: jkMa
 * @Date: 2020/3/31 21:34
 * @ItemName: dubboDemo
 */
@Service
@Component
public class OrderServiceImpl implements OrderService {

    //@Autowired
    @Reference(loadbalance="random",timeout=1000) //dubbo直连
    UserService userService;


    @Override
    public List<UserAddress> initOrder(String userId) {
        // TODO Auto-generated method stub
        System.out.println("用户id："+userId);
        //1、查询用户的收货地址
        List<UserAddress> addressList =
                userService.getUserAddressList(userId);
        return addressList;
    }


    public List<UserAddress> hello(String userId) {
        // TODO Auto-generated method stub

        return Arrays.asList(new UserAddress(10, "测试地址", "1", "测试", "测试", "Y"));
    }
}
