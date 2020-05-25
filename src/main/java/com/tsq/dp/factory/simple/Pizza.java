package com.tsq.dp.factory.simple;

public abstract class Pizza {
    private String name;

    public abstract void prepare();

    public void make() {
        System.out.println(name + "制作完成");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
