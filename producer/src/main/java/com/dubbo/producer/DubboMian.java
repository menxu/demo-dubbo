package com.dubbo.producer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboMian {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo.xml");
        context.start();
        System.out.println("------------dubbo启动------------");
    }
}
