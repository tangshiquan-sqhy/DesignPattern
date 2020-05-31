package com.tsq.dp.factory.simple;

public class OrderPizza {
    public static void main(String[] args) {
        System.out.println("简单工厂模式===========");
        String pizzaType = "cheese";
        Pizza pizza = SimpleFactory.createPizza(pizzaType);
        if (pizza != null) {
            pizza.prepare();
            pizza.make();
        }
    }
}
