package com.dream.tx;

import com.dream.tx.service.TxService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestTx {
    @Test
    public void test1(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        TxService bean = context.getBean(TxService.class);
        bean.update();

    }
}
