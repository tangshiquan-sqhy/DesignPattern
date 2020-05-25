package com.tsq.dp.builder;

public class ClientTest {
    public static void main(String[] args) {
        HouseDirector director = new HouseDirector(new GeneralHouseBuilder());
        House house = director.constructHouse();
        System.out.println(house);

        director.setBuilder(new HighHouseBuilder());
        house = director.constructHouse();
        System.out.println(house);
    }
}
