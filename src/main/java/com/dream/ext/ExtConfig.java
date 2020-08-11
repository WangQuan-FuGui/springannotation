package com.dream.ext;

import com.dream.config.importEntity.Blue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ExtConfig {

    @Bean
    public Blue blue(){
        return new Blue();
    }
}
