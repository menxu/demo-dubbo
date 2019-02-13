package com.dubbo.producer.dao.impl;

import com.dubbo.producer.dao.UserDao;
import org.springframework.stereotype.Service;

@Service
public class UserDaoImpl implements UserDao {
    @Override
    public String getDetail(Integer userId) {
        return "用户信息 userId " + userId ;
    }
}
