package com.tsq.dp.builder;

public abstract class AbstractHouseBuilder {
    private House house = new House();

    public abstract void buildBasic();
    public abstract void buildWall();
    public abstract void roofed();

    public House createHouse() {
        return house;
    }
}
