package com.tsq.dp.builder;

public class ClientTest {
    public static void main(String[] args) {
        System.out.println("建造者模式");
        HouseDirector director = new HouseDirector(new GeneralHouseBuilder());
        House house = director.constructHouse();
        System.out.println(house);

        director.setBuilder(new HighHouseBuilder());
        house = director.constructHouse();
        System.out.println(house);
    }
}
