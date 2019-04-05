package com.hello.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wglbs
 * @Date: 2019-04-05 20:39
 * @Description:
 * @Version 1.0.0
 */
@RestController
@RequestMapping("/demo")
public class HelloController {
    @RequestMapping("/sayHello")
    public String sayHello() {
        return "hello";
    }
}
