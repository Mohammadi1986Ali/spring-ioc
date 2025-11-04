package com.ai4everyone.tutorial.property;

import com.ai4everyone.tutorial.property.api.GeneralService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class Application {
    private static final ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    public static void main(String[] args) {
        log.info("Application#main");

        GeneralService generalService = context.getBean("generalService", GeneralService.class);
        generalService.getService().findCustomerByName("someName");
    }
}
