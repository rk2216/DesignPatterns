package com.rakesh.ducks;

import com.rakesh.behaviors.FlyNoWay;
import com.rakesh.behaviors.QuackNoWay;

public class WoodenDuck extends Duck{
    public WoodenDuck(){
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new QuackNoWay();
    }

    @Override
    public void display() {
        System.out.println("Displaying a Wooden Duck");
    }
}
