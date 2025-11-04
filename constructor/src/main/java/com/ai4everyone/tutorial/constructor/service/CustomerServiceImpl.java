package com.ai4everyone.tutorial.constructor.service;

import com.ai4everyone.tutorial.constructor.api.CustomerService;
import com.ai4everyone.tutorial.constructor.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

public class CustomerServiceImpl implements CustomerService {
    private static final Logger log = LoggerFactory.getLogger(CustomerServiceImpl.class);

    public CustomerServiceImpl() {
        log.info("CustomerServiceImpl#CustomerServiceImpl");
    }

    public void beanInitMethod() {
        log.info("CustomerServiceImpl#beanInitMethod");
    }

    public void beanDestroyMethod() {
        log.info("CustomerServiceImpl#beanDestroyMethod");
    }

    @Override
    public Optional<Customer> findCustomerByName(String customerName) {
        log.info("CustomerServiceImpl#findCustomerByName");
        return Optional.empty();
    }
}
