package com.dream.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextUtil {

    public static ApplicationContext getContextByConfigClass(Class cla){
        return new AnnotationConfigApplicationContext(cla);
    }
}
