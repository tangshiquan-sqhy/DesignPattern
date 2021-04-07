package com.tsq.dp.flyweight;

public final class Tree {
    private final String name;
    private final String data;

    public Tree(String name, String data) {
        this.name = name;
        this.data = data;
        System.out.println("name" + name + "tree created!");
    }

    public String getName() {
        return name;
    }

    public String getData() {
        return data;
    }
}
