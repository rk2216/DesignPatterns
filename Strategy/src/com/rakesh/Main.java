package com.rakesh;

import com.rakesh.behaviors.FlyWithRocket;
import com.rakesh.ducks.Duck;
import com.rakesh.ducks.MallardDuck;
import com.rakesh.ducks.RubberDuck;
import com.rakesh.ducks.WoodenDuck;

public class Main {
    // MiniDuck Simulator
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck rubberDuck = new RubberDuck();
        Duck woodenDuck = new WoodenDuck();

        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();
        System.out.println();

        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.performFly();
        System.out.println("Attaching rockets to rubber duck at runtime!");
        rubberDuck.setFlyBehavior(new FlyWithRocket());
        rubberDuck.performFly();
        System.out.println();

        woodenDuck.display();
        woodenDuck.performQuack();
        woodenDuck.performFly();
        System.out.println();
    }
}
