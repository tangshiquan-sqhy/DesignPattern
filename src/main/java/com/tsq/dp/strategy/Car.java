package com.tsq.dp.strategy;

public class Car {
    private Movable movable;

    public Car(Movable movable) {
        this.movable = movable;
    }

    public Movable getMovable() {
        return movable;
    }

    public void setMovable(Movable movable) {
        this.movable = movable;
    }

    public void drive() {
        System.out.println("汽车移动前准备");
        movable.move();
        System.out.println("汽车开动了");
    }
}
