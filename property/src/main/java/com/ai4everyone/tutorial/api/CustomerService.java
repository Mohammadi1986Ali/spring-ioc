package com.ai4everyone.tutorial.api;

import com.ai4everyone.tutorial.model.Customer;

import java.util.Optional;

public interface CustomerService {
    Optional<Customer> findCustomerByName(String customerName);
}
