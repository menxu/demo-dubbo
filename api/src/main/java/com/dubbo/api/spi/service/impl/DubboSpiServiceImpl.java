package com.dubbo.api.spi.service.impl;

import com.dubbo.api.spi.service.SpiService;

public class DubboSpiServiceImpl implements SpiService {
    @Override
    public String test() {
        return "DubboSpiServiceImpl test";
    }
}
