package com.tao.dubbo.service.impl;

import com.tao.dubbo.service.DemoService;

/**
 * Created by DELL on 2017/9/20.
 */
public class DemoServiceImpl implements DemoService {

    public void sayHello(String name) {
        System.out.println("你好,欢迎来到dubbo世界!");
    }
}
