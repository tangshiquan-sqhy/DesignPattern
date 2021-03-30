package com.tsq.dp.builder;

public class HouseDirector {
    private AbstractHouseBuilder builder;

    public HouseDirector(AbstractHouseBuilder builder) {
        this.builder = builder;
    }

    public void setBuilder(AbstractHouseBuilder builder) {
        this.builder = builder;
    }

    public House constructHouse() {
        builder.buildBasic();
        builder.buildWall();
        builder.roofed();
        return builder.createHouse();
    }
}
