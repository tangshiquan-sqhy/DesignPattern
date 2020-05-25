package com.tsq.dp.builder;

public class HighHouseBuilder extends AbstractHouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("高楼房子修地基");
    }

    @Override
    public void buildWall() {
        System.out.println("高楼房子修墙");
    }

    @Override
    public void roofed() {
        System.out.println("高楼房子封楼顶");
    }
}
