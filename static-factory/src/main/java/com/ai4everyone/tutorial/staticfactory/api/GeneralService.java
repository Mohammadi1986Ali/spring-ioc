package com.ai4everyone.tutorial.staticfactory.api;

public interface GeneralService {
    CustomerService getService();

    void setService(CustomerService service);
}
