package com.ai4everyone.tutorial.constructor;

import com.ai4everyone.tutorial.constructor.api.GeneralService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    private static final Logger log = LoggerFactory.getLogger(Application.class);
    private static final ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    public static void main(String[] args) {
        log.info("Application#main");

        GeneralService generalService = context.getBean("generalService", GeneralService.class);
        generalService.getService().findCustomerByName("someName");
        context.close();
    }
}
