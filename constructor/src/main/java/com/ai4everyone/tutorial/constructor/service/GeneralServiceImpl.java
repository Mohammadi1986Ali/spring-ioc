package com.ai4everyone.tutorial.constructor.service;

import com.ai4everyone.tutorial.constructor.api.CustomerService;
import com.ai4everyone.tutorial.constructor.api.GeneralService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GeneralServiceImpl implements GeneralService {
    private CustomerService service;

    public GeneralServiceImpl() {
        log.info("GeneralServiceImpl#GeneralServiceImpl");
    }

    public GeneralServiceImpl(CustomerService service) {
        log.info("GeneralServiceImpl#GeneralServiceImpl: {}", service.getClass());
        this.service = service;
    }

    public void beanInitMethod() {
        log.info("GeneralServiceImpl#beanInitMethod");
    }

    public void beanDestroyMethod() {
        log.info("GeneralServiceImpl#beanDestroyMethod");
    }

    @Override
    public CustomerService getService() {
        return service;
    }

    @Override
    public void setService(CustomerService service) {
        this.service = service;
    }
}
