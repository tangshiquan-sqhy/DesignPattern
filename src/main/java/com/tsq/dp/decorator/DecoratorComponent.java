package com.tsq.dp.decorator;

public abstract class DecoratorComponent implements IComponent {

    IComponent component;

    public DecoratorComponent(IComponent component) {
        this.component = component;
    }
}
