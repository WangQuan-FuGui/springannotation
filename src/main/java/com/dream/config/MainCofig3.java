package com.dream.config;

import com.dream.bean.Person;
import com.dream.config.condition.LinuxCondition;
import com.dream.config.condition.WindowsCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Conditional({WindowsCondition.class})
@Configuration
public class MainCofig3 {

    /**
     * @Conditional:按照一定的条件进行判断，满座条件给容器中注册Bean
     */
    @Conditional({WindowsCondition.class})
    @Bean("bill")
    public Person person(){
        return new Person("Bill Gates",62);
    }

    @Conditional({LinuxCondition.class})
    @Bean("linus")
    public Person person02(){
        return new Person("linus",48);
    }


}
