package com.dream.config.profile;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * profile
 * spring为我们提供的可以根据当前环境动态的激活和切换一系列组件的功能.
 * <p>
 * 开发环境，测试环境，生产环境.
 * 数据源:A   <   B     <  C
 *
 * @profile：指定组件在那个环境的情况下才能被注册到容器中，不指定：任何环境下都能注册这个组件 1),加拉环境标识的bean，只有这个环境激活的时候才能注册到容器中.默认是default
 * 写在类上满足条件加载
 * 没有环境标识的类任何情况都会加载
 */
@Profile("test")
@PropertySource("classpath:/dbConfig.properties")
@Configuration
public class MianConfigProfile {

    @Value("${db.name}")
    private String name;

    @Value("${db.drive}")
    private String drive;
   //1.使用命令行行动参数：在虚拟机参数位置加 -Dspring.profiles.active=test
    //2.applicationContest.getEnvironment().setActiveProfiles("...")

    //@Profile("default")
    @Profile("test")
    @Bean
    public DataSource dataSourceTest(@Value("${db.password}") String pwd) throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(name);
        dataSource.setPassword(pwd);
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setDriverClass(drive);

        return dataSource;
    }
    @Profile("dev")
    @Bean
    public DataSource dataSourceDev(@Value("${db.password}") String pwd) throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(name);
        dataSource.setPassword(pwd);
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setDriverClass(drive);

        return dataSource;
    }
    @Profile("prod")
    @Bean
    public DataSource dataSourceProd(@Value("${db.password}") String pwd) throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(name);
        dataSource.setPassword(pwd);
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setDriverClass(drive);

        return dataSource;
    }
}
