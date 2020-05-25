package com.tsq.dp.factory.absfactory;

public class LDPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if ("greek".equals(pizzaType)) {
            pizza = new LDGreekPizza();
            pizza.setName("伦敦希腊披萨");
        } else if ("cheese".equals(pizzaType)) {
            pizza = new LDCheesePizza();
            pizza.setName("伦敦奶酪披萨");
        }
        return pizza;
    }
}
