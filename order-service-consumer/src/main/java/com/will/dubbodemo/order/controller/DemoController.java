package com.will.dubbodemo.order.controller;

import com.will.dubbodemo.order.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Will
 * @since 2.0.0
 */
@RestController
@RequestMapping("/consumer")
public class DemoController {
    @Resource
    private OrderService orderService;

    @GetMapping
    public void test() {
        orderService.initOrder("123");
    }
}
