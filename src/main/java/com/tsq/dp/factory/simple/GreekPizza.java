package com.tsq.dp.factory.simple;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备希腊披萨");
    }
}
