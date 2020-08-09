package com.dream;

import com.dream.bean.Dog;
import com.dream.config.MianCofig6;
import com.dream.util.ApplicationContextUtil;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

public class TestBeanLifecycle {
    private ApplicationContext context= ApplicationContextUtil.getContextByConfigClass(MianCofig6.class);

    @Test
    public void test1(){
        context.getBean("car");
    }

    @Test
    public void test2(){
        System.out.println(context.getBean("dog"));
        Dog bean = context.getBean(Dog.class);
        System.out.println(bean.applicationContext);

    }
}
