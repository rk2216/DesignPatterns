package com.rakesh;

public class CheesePizza extends Pizza{
    @Override
    void prepare(){
        super.prepare();
        System.out.println("Adding Cheese");
    }
}
