package com.tsq.dp.factory.simple;

public class SimpleFactory {

    public static Pizza createPizza(String pizzaType) {
        System.out.println("使用简单工厂模式");
        Pizza pizza = null;
        if ("greek".equals(pizzaType)) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if ("cheese".equals(pizzaType)) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }
        return pizza;
    }

}
