package com.dream.ext;

import org.junit.Test;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestExt {

    @Test
    public void test1(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ExtConfig.class);
        context.close();
    }
    @Test
    public void test2(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ExtConfig.class);
        context.publishEvent(new ApplicationEvent("发布事件时间。。。。") {
            @Override
            public Object getSource() {
                return super.getSource();
            }
        });
        context.close();
    }
}
