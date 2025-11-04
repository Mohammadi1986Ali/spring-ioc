package com.ai4everyone.tutorial.property;

import com.ai4everyone.tutorial.property.api.GeneralService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class ApplicationTest {
    static ApplicationContext context;

    @BeforeAll
    static void setup() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    void whenGeneralServiceCreatedBySpringContext_thenCustomerServiceShouldNotBeNull() {
        log.info("ApplicationTest#whenGeneralServiceCreatedBySpringContext_thenCustomerServiceShouldNotBeNull");
        GeneralService generalService = context.getBean("generalService", GeneralService.class);
        assertNotNull(generalService.getService());
    }
}