package com.rakesh.ducks;

import com.rakesh.behaviors.FlyWithWings;
import com.rakesh.behaviors.Quack;

public class MallardDuck extends Duck{
    public MallardDuck(){
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Displaying a Mallard Duck");
    }
}
