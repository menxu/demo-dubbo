package com.dubbo.api.spi.service.impl;

import com.dubbo.api.spi.service.SpiService;

public class RmiSpiServiceImpl implements SpiService {
    @Override
    public String test() {
        return "RmiSpiServiceImpl test";
    }
}
