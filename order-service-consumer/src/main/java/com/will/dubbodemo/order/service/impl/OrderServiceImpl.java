package com.will.dubbodemo.order.service.impl;

import com.will.dubbodemo.bean.UserAddress;
import com.will.dubbodemo.order.service.OrderService;
import com.will.dubbodemo.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Will
 * @since 2.0.0
 */
@Service
@DubboService
public class OrderServiceImpl implements OrderService {
    @DubboReference(check = false, stub = "com.will.dubbodemo.order.service.impl.UserServiceStub")
    UserService userService;

    @Override
    public void initOrder(String userId) {
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        System.out.println(userAddressList);
    }
}
