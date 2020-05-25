package com.tsq.dp.factory.simple;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备奶酪披萨原料");
    }
}
