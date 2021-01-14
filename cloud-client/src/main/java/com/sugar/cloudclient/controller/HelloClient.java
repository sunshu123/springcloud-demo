package com.sugar.cloudclient.controller;

import com.sugar.cloudclient.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/Hello")
public class HelloClient {

    @Autowired
    private HelloService helloService;

    @GetMapping("/getClient")
    public String getClient(){
        return helloService.getProduct();
    }
}
