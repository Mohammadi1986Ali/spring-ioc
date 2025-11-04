package com.ai4everyone.tutorial.factorymethod.api;

public interface GeneralService {
    CustomerService getService();

    void setService(CustomerService service);
}
