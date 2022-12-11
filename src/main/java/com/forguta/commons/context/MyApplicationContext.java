package com.forguta.commons.context;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MyApplicationContext {

    private static ApplicationContext applicationContext;

    public MyApplicationContext(ApplicationContext applicationContext) {
        setApplicationContext(applicationContext);
    }

    private static void setApplicationContext(ApplicationContext applicationContext) {
        MyApplicationContext.applicationContext = applicationContext;
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}
