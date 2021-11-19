package com.rakesh.decorator;

import com.rakesh.beverage.Beverage;

public class Mocha extends CondimentDecorator{
    public Mocha(Beverage beverage){
        super(beverage);
    }
    @Override
    public double cost() {
        double cost = 0;
        switch (beverage.getSize()){
            case TALL : cost = 5; break;
            case GRANDE : cost = 10; break;
            case VENTI : cost = 20; break;
        }
        return cost + beverage.cost();
    }

    @Override
    public String getDescription() {
        return "Mocha, " + beverage.getDescription();
    }
}
