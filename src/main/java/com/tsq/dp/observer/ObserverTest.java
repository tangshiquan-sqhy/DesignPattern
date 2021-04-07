package com.tsq.dp.observer;

public class ObserverTest {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.addObserver(new Observer1());
        subject.addObserver(new Observer2());
        subject.notifyObserver(new Object());
    }
}
