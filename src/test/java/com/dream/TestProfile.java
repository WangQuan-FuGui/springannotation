package com.dream;

import com.dream.config.profile.MianConfigProfile;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class TestProfile {

  @Test
    public void test1(){
      AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
      annotationConfigApplicationContext.getEnvironment().setActiveProfiles("test","dev");//设置环境
      annotationConfigApplicationContext.register(MianConfigProfile.class);//注册
      annotationConfigApplicationContext.refresh();//刷新
      String[] beanNamesForType = annotationConfigApplicationContext.getBeanNamesForType(DataSource.class);

      for (String name:beanNamesForType){
          System.out.println(name);
      }
  }
}
