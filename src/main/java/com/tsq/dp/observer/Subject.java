package com.tsq.dp.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<IObserver> observerList = new ArrayList<>();

    public void addObserver(IObserver observer) {
        this.observerList.add(observer);
    }

    public void removeObserver(IObserver observer) {
        this.observerList.remove(observer);
    }

    public void notifyObserver(Object obj) {
        observerList.forEach(observer -> observer.update(obj));
    }
}
