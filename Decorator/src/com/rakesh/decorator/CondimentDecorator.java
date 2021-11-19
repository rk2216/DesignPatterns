package com.rakesh.decorator;

import com.rakesh.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;
    public abstract String getDescription();
    public CondimentDecorator(Beverage beverage){
        this.beverage = beverage;
    }
    public Size getSize(){
        return beverage.getSize();
    }
}
