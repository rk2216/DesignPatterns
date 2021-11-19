package com.rakesh.decorator;

import com.rakesh.beverage.Beverage;

public class Milk extends CondimentDecorator{
    public Milk(Beverage beverage) {
        super(beverage);
    }
    @Override
    public double cost() {
        double cost = 0;
        switch (beverage.getSize()){
            case TALL : cost = 15; break;
            case GRANDE : cost = 20; break;
            case VENTI : cost = 30; break;
        }
        return cost + beverage.cost();
    }

    @Override
    public String getDescription() {
        return "Milk, " + beverage.getDescription();
    }
}
