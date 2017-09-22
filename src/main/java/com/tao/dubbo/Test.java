package com.tao.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by DELL on 2017/9/20.
 */
public class Test {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:config/applicationContext-dubboProvider.xml"});
        context.start();

        System.in.read(); // 按任意键退出
    }
}
