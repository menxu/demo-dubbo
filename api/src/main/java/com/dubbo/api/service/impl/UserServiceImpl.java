package com.dubbo.api.service.impl;

import com.dubbo.api.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getDetail(Integer userId) {
        return "UserServiceImpl userId:" + userId;
    }
}
