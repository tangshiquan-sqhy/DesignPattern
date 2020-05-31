package com.tsq.dp.adapter.classadapter;

public class ClientTest {
    public static void main(String[] args) {
        System.out.println("类适配器模式=====");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter220To5());
    }
}
