package com.ai4everyone.tutorial.constructor.api;

import com.ai4everyone.tutorial.constructor.model.Customer;

import java.util.Optional;

public interface CustomerService {
    Optional<Customer> findCustomerByName(String customerName);
}
