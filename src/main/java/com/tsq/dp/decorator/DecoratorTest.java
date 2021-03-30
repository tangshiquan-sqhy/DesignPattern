package com.tsq.dp.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        IComponent component = new DecoratorCamera(new CarComponent());
        component.operate();
    }
}
