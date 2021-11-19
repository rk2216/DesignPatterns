package com.rakesh.ducks;

import com.rakesh.behaviors.FlyBehavior;
import com.rakesh.behaviors.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }
    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
    public void performFly(){
        this.flyBehavior.fly();
    }
    public void performQuack(){
        this.quackBehavior.quack();
    }
    public void swim(){
        System.out.println("Duck is swimming");
    }
    public abstract void display();
}
