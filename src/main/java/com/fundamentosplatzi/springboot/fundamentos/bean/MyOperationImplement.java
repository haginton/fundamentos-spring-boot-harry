package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyOperationImplement implements MyOperation{ //Se convertira esta clase en un Bean de Spring
    @Override
    public int sum(int number) {
        return number + 1;
    }
}
