package com.dream.config;

//配置类==配置文件

import com.dream.bean.Person;
import com.dream.config.ComponentScan.MyTypeFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration //告诉spring这是一个配置类
/*@ComponentScan(value={"com.dream"},excludeFilters ={//开启包扫描
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes ={Controller.class})} //排除
)*/
@ComponentScan(value={"com.dream"},//开启包扫描
        includeFilters ={//包含
       // @ComponentScan.Filter(type = FilterType.ANNOTATION,classes ={Controller.class}),
        @ComponentScan.Filter(type = FilterType.CUSTOM,classes ={MyTypeFilter.class})//自定义规则
        }
        ,useDefaultFilters = false //不使用默认过滤
)
public class MainCofig {

    //给容器中注册一个Bean
    @Bean
    public Person person(){
        return new Person("zhangsan",12);
    }
}
