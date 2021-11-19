package com.rakesh;

import com.rakesh.beverage.Beverage;
import com.rakesh.beverage.DarkCoffee;
import com.rakesh.beverage.Espresso;
import com.rakesh.decorator.Milk;
import com.rakesh.decorator.Mocha;

public class Main {
    // Starbuzz Coffee
    public static void main(String[] args) {
	// write your code here
        Beverage beverage = new DarkCoffee();
        System.out.println(beverage.getDescription() + ": with cost Rs." + beverage.cost());

        Beverage beverage1 = new Espresso();
        beverage1.setSize(Beverage.Size.GRANDE);
        beverage1 = new Milk(beverage1);
        beverage1 = new Mocha(beverage1);

        System.out.println(beverage1.getDescription() + " with cost: Rs." + beverage1.cost());
    }
}
