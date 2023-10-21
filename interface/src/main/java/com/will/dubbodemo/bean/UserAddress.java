package com.will.dubbodemo.bean;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author Will
 * @since 2.0.0
 */
@Data
@Accessors(chain = true)
public class UserAddress implements Serializable {
    private Integer id;

    private String address;

    private String userId;

    private String consignee;

    private String phoneNum;

    private String isDefault;
}
