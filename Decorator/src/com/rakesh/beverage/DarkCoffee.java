package com.rakesh.beverage;

public class DarkCoffee extends Beverage{
    private double cost = 50;
    public DarkCoffee(){
        description = "Dark Coffee";
    }
    @Override
    public double cost() {
        return cost;
    }
}
