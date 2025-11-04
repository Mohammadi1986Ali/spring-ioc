package com.ai4everyone.tutorial.service;

import com.ai4everyone.tutorial.api.CustomerService;
import com.ai4everyone.tutorial.api.GeneralService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GeneralServiceImpl implements GeneralService {
    private CustomerService service;

    @Override
    public CustomerService getService() {
        log.info("GeneralServiceImpl#getService");
        return service;
    }

    @Override
    public void setService(CustomerService service) {
        log.info("GeneralServiceImpl#setService");
        this.service = service;
    }
}
