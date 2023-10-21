package com.will.dubbodemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Will
 * @since 2.0.0
 */
@RestController
@RequestMapping("/produder")
public class DemoController {


    @GetMapping
    public void test() {

    }
}
