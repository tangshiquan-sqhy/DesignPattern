package com.tsq.dp.strategy;

public class StrategyTest {
    public static void main(String[] args) {
        Car car = new Car(new ElectricityMove());
        car.drive();
        System.out.println("================");
        car.setMovable(new GasolineMove());
        car.drive();
    }
}
