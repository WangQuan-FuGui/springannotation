package com.dream;


import com.dream.bean.Person;
import com.dream.config.MianConfig7;
import com.dream.util.ApplicationContextUtil;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

public class TestValue {
    private ApplicationContext context= ApplicationContextUtil.getContextByConfigClass(MianConfig7.class);

    @Test
    public void test1(){
        Person bean = context.getBean(Person.class);
        System.out.println(bean);
    }
}
