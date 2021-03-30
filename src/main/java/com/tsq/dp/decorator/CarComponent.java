package com.tsq.dp.decorator;

public class CarComponent implements IComponent {
    @Override
    public void operate() {
        System.out.println("倒车！");
    }
}
