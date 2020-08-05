package com.dream;

import com.dream.bean.Person;
import com.dream.config.MainCofig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestScope {

    @SuppressWarnings("resource")
    @Test
    public void test1(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainCofig2.class);
        Person bean = context.getBean(Person.class);
        Person bean2 = context.getBean(Person.class);

        System.out.println((bean==bean2));

    }
}
