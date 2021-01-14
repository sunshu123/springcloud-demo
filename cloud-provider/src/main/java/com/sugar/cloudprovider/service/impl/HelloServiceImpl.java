package com.sugar.cloudprovider.service.impl;

import com.sugar.cloudprovider.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String getHello() {
        return "你好兄弟";
    }
}
