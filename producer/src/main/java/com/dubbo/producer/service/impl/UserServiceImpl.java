package com.dubbo.producer.service.impl;

import com.dubbo.producer.dao.UserDao;
import com.dubbo.servermodel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public String getDetail(Integer userId) {
        System.out.println(super.getClass().getName() + "被调用一次 " + System.currentTimeMillis());
        return userDao.getDetail(userId);
    }
}
