package com.tsq.dp.factory.absfactory;

public class NYPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if ("greek".equals(pizzaType)) {
            pizza = new NYGreekPizza();
            pizza.setName("纽约希腊披萨");
        } else if ("cheese".equals(pizzaType)) {
            pizza = new NYCheesePizza();
            pizza.setName("纽约奶酪披萨");
        }
        return pizza;
    }
}
