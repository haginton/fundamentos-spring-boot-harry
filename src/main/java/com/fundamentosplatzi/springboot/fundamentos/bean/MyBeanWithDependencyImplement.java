package com.fundamentosplatzi.springboot.fundamentos.bean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency{

    Log LOGGER = LogFactory.getLog(MyBeanWithDependencyImplement.class);

    @Autowired
    private MyOperation myOperation;

    public MyBeanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        LOGGER.info("Hemos ingresado al metodos printWithDependency");
        int numero = 1;
        LOGGER.debug("El numero enviado como parametro a la dependencia myOperation es : " + numero);
        System.out.println(myOperation.sum(numero));
        System.out.println("Hola desde la implementación de un Bean con dependencia");
    }
}
