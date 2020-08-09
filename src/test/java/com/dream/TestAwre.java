package com.dream;

import com.dream.aware.MyHelloAware;
import com.dream.bean.Person;
import com.dream.config.MianConfig9;
import com.dream.util.ApplicationContextUtil;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

public class TestAwre {

    private ApplicationContext context= ApplicationContextUtil.getContextByConfigClass(MianConfig9.class);

    @Test
    public void test1(){
        MyHelloAware bean = context.getBean(MyHelloAware.class);
        System.out.println(bean);
    }
}
