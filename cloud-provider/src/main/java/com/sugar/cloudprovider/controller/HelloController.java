package com.sugar.cloudprovider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sugar.cloudprovider.service.HelloService;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private HelloService helloService;
    @GetMapping("/getHello")
    public String getHello(){

        return helloService.getHello();
    }
}
