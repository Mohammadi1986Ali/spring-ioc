package com.ai4everyone.tutorial.staticfactory.util;

import com.ai4everyone.tutorial.staticfactory.api.CustomerService;
import com.ai4everyone.tutorial.staticfactory.service.CustomerServiceImpl;

public class StaticFactory {
    public static CustomerService getCustomerService() {
        return new CustomerServiceImpl();
    }
}
