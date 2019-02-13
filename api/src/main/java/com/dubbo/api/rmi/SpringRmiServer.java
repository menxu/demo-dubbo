package com.dubbo.api.rmi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringRmiServer {
    public static void main(String[] args) {
        openRmiServer();
    }

    private static void openRmiServer() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-server.xml");
        System.out.println("RMI服务端启动完成");
    }
}
