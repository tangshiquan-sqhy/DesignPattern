package com.tsq.dp.factory.absfactory;

public class OrderPizza {
    public static void main(String[] args) {
        String pizzaType = "greek";
        PizzaStore pizzaStore = new PizzaStore(new NYPizzaFactory());
        pizzaStore.getPizza(pizzaType);
    }
}
