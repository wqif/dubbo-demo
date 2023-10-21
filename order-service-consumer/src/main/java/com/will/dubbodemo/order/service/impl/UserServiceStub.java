package com.will.dubbodemo.order.service.impl;

import com.will.dubbodemo.bean.UserAddress;
import com.will.dubbodemo.service.UserService;
import org.apache.zookeeper.common.StringUtils;

import java.util.List;

/**
 * @author Will
 * @since 2.0.0
 */
public class UserServiceStub implements UserService {
    private final UserService userService;

    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("UserServiceStub");
        if (StringUtils.isBlank(userId)) {
            return null;
        }
        return userService.getUserAddressList(userId);
    }
}
