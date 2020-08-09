package com.dream.config;

import com.dream.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @PropertySource加载配置外部文件
 *  读取.properties文件中的k/v保存到运行的环境中.
 */
@PropertySource({"classpath:/persson.properties"})
@Configuration
public class MianConfig7 {

    /**
     * @Value
     *      在类的属性上加value注解,容器自动装配值.
     * @return
     */
    @Bean
    public Person person(){
        return new Person();
    }
}
