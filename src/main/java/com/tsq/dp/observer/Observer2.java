package com.tsq.dp.observer;

public class Observer2 implements IObserver {
    @Override
    public void update(Object obj) {
        System.out.println("Observer2 update " + obj);
    }
}
