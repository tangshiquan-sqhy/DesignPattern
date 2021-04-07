package com.tsq.dp.template;

public abstract class AbstractBase {

    public void submitForm() {
        System.out.println("receive task！");
        System.out.println("init common data！");
        saveForm();
        System.out.println("complete task");
    }

    public abstract void saveForm();
}
