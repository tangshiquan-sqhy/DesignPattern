package com.tsq.dp.factory.absfactory;

public class PizzaStore {
    private PizzaFactory pizzaFactory;

    public PizzaStore(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public void getPizza(String pizzaType) {
        Pizza pizza = pizzaFactory.createPizza(pizzaType);
        if (pizza !=null) {
            pizza.prepare();
            pizza.make();
        }
    }
}
