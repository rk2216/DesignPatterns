package com.rakesh.ducks;

import com.rakesh.behaviors.FlyNoWay;
import com.rakesh.behaviors.QuackSqueak;

public class RubberDuck extends Duck{
    public RubberDuck(){
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new QuackSqueak();
    }

    @Override
    public void display() {
        System.out.println("Displaying a Rubber Duck");
    }
}
