package com.dream;


import com.dream.config.MianCofig4;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestImprot {
    private AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MianCofig4.class);
    @Test
    public void test1(){
        String[] names = context.getBeanDefinitionNames();
        for (String name:names){
            System.out.println(name);
        }
    }
}
