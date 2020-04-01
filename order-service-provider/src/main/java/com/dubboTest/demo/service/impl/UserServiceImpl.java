package com.dubboTest.demo.service.impl;

import com.Demo.dubbo.bean.UserAddress;
import com.Demo.dubbo.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Auther: jkMa
 * @Date: 2020/3/31 22:23
 * @ItemName: dubboDemo
 */
@Service
@Component
public class UserServiceImpl implements UserService {

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        // TODO Auto-generated method stub
        System.out.println("UserServiceImpl..3.....");
        UserAddress address1 = new UserAddress(1, "北京市昌平区宏福科技园综合楼3层", "1", "李老师", "010-56253825", "Y");
        UserAddress address2 = new UserAddress(2, "深圳市宝安区西部硅谷大厦B座3层（深圳分校）", "1", "王老师", "010-56253825", "N");
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//        if(Math.random()>0.5) {
//            throw new RuntimeException();
//        }
        return Arrays.asList(address1,address2);
    }
}
