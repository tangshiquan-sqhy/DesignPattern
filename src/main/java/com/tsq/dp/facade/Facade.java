package com.tsq.dp.facade;

public class Facade {

    private Service1 s1 = new Service1();
    private Service2 s2 = new Service2();

    public void doFacade() {
        s2.doSomething2();
        System.out.println("do some other things");
        s1.doSomething1();
    }
}
