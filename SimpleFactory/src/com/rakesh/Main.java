package com.rakesh;

public class Main {
    // Pizza Counter
    public static void main(String[] args) {
	    PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
	    pizzaStore.orderPizza("cheese");
    }
}
