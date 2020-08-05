package com.dream.config.factorybean;

import com.dream.config.importEntity.Color;
import org.springframework.beans.factory.FactoryBean;

//创建一个spring定义的FactoryBean
public class MyFactoryBean implements FactoryBean<Color>{

    //返回一个Color对象的Bean放到容器中
    @Override
    public Color getObject() throws Exception {
        System.out.println("getObject..........");
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    //是否单例。tue单例
    @Override
    public boolean isSingleton() {
        return false;
    }
}
