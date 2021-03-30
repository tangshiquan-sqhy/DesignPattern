package com.tsq.dp.decorator;

public class DecoratorCamera extends DecoratorComponent {

    public DecoratorCamera(IComponent component) {
        super(component);
    }

    @Override
    public void operate() {
        System.out.println("开启倒车影像！！");
        component.operate();
    }
}
