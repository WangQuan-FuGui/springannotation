package com.dream.config;

import com.dream.config.importEntity.Color;
import com.dream.config.importEntity.Red;
import com.dream.config.importSelector.MyImportBeanDefinitionRegistrar;
import com.dream.config.importSelector.MyImportSelector;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


/**
 * @Conditional:如果条件不成立的话这个类不会受IOC管理
 * 所以Import也无效
 */
//@Conditional({LinuxCondition.class})
@Configuration
/**
 * @Import: 快速引入一个组件，id默认是全类名
 */
@Import({Color.class, Red.class,
        MyImportSelector.class,
        MyImportBeanDefinitionRegistrar.class
})
public class MianCofig4 {

    /**
     * @Import:
     *  扩展:
     *     第一种方式: ImportSelector 这个类实现了ImportSelector,实现的方法中返回的类名字会被加载到容器中
     *     第二种方式: ImportBeanDefinitionRegistrar 这个类实现了ImportBeanDefinitionRegistrar，实现的方法中有BeanDefinitionRegistrar类可以注册bean
     */

}
