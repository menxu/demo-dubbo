package com.dubbo.api.spi;

import com.dubbo.api.spi.service.SpiService;

import java.io.IOException;
import java.util.Iterator;
import java.util.ServiceLoader;

public class SpiMain {
    public static void main(String[] args) throws IOException {
        ServiceLoader<SpiService> spiLoader = ServiceLoader.load(SpiService.class);
        Iterator<SpiService> iteratorSpi = spiLoader.iterator();
        while (iteratorSpi.hasNext()) {
            SpiService spiService = iteratorSpi.next();
            System.out.println(spiService.test());
        }
    }
}
