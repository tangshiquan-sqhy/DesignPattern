package com.tsq.dp.factory.simple;

public class OrderPizza {
    public static void main(String[] args) {
        String pizzaType = "cheese";
        Pizza pizza = SimpleFactory.createPizza(pizzaType);
        if (pizza != null) {
            pizza.prepare();
            pizza.make();
        }
    }
}
