package com.ai4everyone.tutorial.factorymethod.api;

import com.ai4everyone.tutorial.factorymethod.model.Customer;

import java.util.Optional;

public interface CustomerService {
    Optional<Customer> findCustomerByName(String customerName);
}
