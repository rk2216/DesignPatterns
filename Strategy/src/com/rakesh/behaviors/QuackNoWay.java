package com.rakesh.behaviors;

public class QuackNoWay implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Duck cannot Quack");
    }
}
