package com.dream;

import com.dream.config.MainCofig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestComponentScan {

    @Test
    public void test1(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainCofig.class);

        String[] beanDefinitionNames = context.getBeanDefinitionNames();

        for(String name:beanDefinitionNames){
            System.out.println(name);
        }
    }
}
