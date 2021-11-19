package com.rakesh.behaviors;

public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("Duck cannot Fly!");
    }
}
