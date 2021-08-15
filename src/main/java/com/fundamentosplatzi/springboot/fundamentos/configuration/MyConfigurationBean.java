package com.fundamentosplatzi.springboot.fundamentos.configuration;

import com.fundamentosplatzi.springboot.fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean //dependencia
    public MyBean beanOperation(){
        return new MyBean2Implement();
    }

    @Bean //dependencia
    public MyOperation beanOperationSuma(){
        return new MyOperationImplement();
    }

    @Bean //dependencia
    public MyBeanWithDependency beanOperationWithDependency(MyOperation myOperation){
        return new MyBeanWithDependencyImplement(myOperation);
    }
}
