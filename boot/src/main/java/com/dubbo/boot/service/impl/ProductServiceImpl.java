package com.dubbo.boot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.servermodel.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public String getDetail(Integer productId) {
        return "Dubbo Boot productID: " + productId;
    }
}
