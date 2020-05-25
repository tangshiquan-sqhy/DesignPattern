package com.tsq.dp.builder;

public class GeneralHouseBuilder extends AbstractHouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("普通房子修地基");
    }

    @Override
    public void buildWall() {
        System.out.println("普通房子修墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子封楼顶");
    }
}
