package com.Demo.dubbo.service;

import com.Demo.dubbo.bean.UserAddress;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Auther: jkMa
 * @Date: 2020/3/30 23:49
 * @ItemName: dubboDemo
 */
public interface UserService {
    public List<UserAddress> getUserAddressList(String userId);

}
