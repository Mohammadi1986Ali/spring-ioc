package com.ai4everyone.tutorial.property.service;

import com.ai4everyone.tutorial.property.api.CustomerService;
import com.ai4everyone.tutorial.property.model.Customer;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

@Slf4j
public class CustomerServiceImpl implements CustomerService {
    @Override
    public Optional<Customer> findCustomerByName(String customerName) {
        log.info("CustomerServiceImpl#findCustomerByName: {}", customerName);
        return Optional.empty();
    }
}
