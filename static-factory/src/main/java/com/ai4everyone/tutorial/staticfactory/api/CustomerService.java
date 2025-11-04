package com.ai4everyone.tutorial.staticfactory.api;

import com.ai4everyone.tutorial.staticfactory.model.Customer;

import java.util.Optional;

public interface CustomerService {
    Optional<Customer> findCustomerByName(String customerName);
}
