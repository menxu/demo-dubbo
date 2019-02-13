package com.dubbo.api.rmi;

import com.dubbo.api.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringRmiClient {
    public static void main(String[] args) {
        sendRmiClient();
    }

    private static void sendRmiClient() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-client.xml");
        UserService userService = (UserService) applicationContext.getBean("remoteService");
        String result = userService.getDetail(123);
        System.out.println(result);
    }
}
