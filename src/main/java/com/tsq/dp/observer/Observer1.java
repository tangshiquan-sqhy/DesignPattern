package com.tsq.dp.observer;

public class Observer1 implements IObserver {
    @Override
    public void update(Object obj) {
        System.out.println("Observer1 update " + obj);
    }
}
