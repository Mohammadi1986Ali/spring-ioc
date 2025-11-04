package com.ai4everyone.tutorial.constructor.service;

import com.ai4everyone.tutorial.constructor.api.CustomerService;
import com.ai4everyone.tutorial.constructor.model.Customer;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

@Slf4j
public class CustomerServiceImpl implements CustomerService {
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
