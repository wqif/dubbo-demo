package com.will.dubbodemo.service.impl;

import com.will.dubbodemo.bean.UserAddress;
import com.will.dubbodemo.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Method;

import java.util.Arrays;
import java.util.List;

/**
 * @author Will
 * @since 2.0.0
 */
@DubboService
public class UserServiceImpl implements UserService {

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        return Arrays.asList(
                new UserAddress().setId(1).setAddress("广州市番禺区1")
                        .setConsignee("1").setConsignee("张三")
                        .setUserId("1").setIsDefault("1"),
                new UserAddress().setId(2).setAddress("广州市番禺区2")
                        .setConsignee("2").setConsignee("李四")
                        .setUserId("2").setIsDefault("0")
        );
    }
}
