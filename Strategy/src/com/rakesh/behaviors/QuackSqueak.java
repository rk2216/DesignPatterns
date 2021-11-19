package com.rakesh.behaviors;

public class QuackSqueak implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Squeak Squeak!");
    }
}
