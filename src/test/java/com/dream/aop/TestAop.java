package com.dream.aop;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAop {
    @Test
    public void test1(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MianConfigOfAop.class);
        MathCalculator bean = context.getBean(MathCalculator.class);
        bean.div(1,2);

    }
}
