package com.ai4everyone.tutorial.factorymethod.util;

import com.ai4everyone.tutorial.factorymethod.api.CustomerService;
import com.ai4everyone.tutorial.factorymethod.service.CustomerServiceImpl;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FactoryMethod {
    public CustomerService getService() {
        log.info("FactoryMethod#getService");
        return new CustomerServiceImpl();
    }
}
