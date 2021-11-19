package com.rakesh.beverage;

public class Espresso extends Beverage{
    private double cost = 60;
    public Espresso(){
        description = "Espresso";
    }
    @Override
    public double cost() {
        return cost;
    }
}
