package com.will.dubbodemo.service;

import com.will.dubbodemo.bean.UserAddress;

import java.util.List;

/**
 * @author Will
 * @since 2.0.0
 */
public interface UserService {

    List<UserAddress> getUserAddressList(String userId);
}
