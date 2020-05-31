package com.tsq.dp.factory.absfactory;

public class OrderPizza {
    public static void main(String[] args) {
        System.out.println("抽象工厂模式======");
        String pizzaType = "greek";
        PizzaStore pizzaStore = new PizzaStore(new NYPizzaFactory());
        pizzaStore.getPizza(pizzaType);
    }
}
