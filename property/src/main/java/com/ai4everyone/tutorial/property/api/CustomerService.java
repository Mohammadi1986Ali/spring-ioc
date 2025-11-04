package com.ai4everyone.tutorial.property.api;

import com.ai4everyone.tutorial.property.model.Customer;

import java.util.Optional;

public interface CustomerService {
    Optional<Customer> findCustomerByName(String customerName);
}
