package com.tsq.dp.flyweight;

public class FlyweightTest {
    public static void main(String[] args) {
        Tree tree1 = TreeFactory.createTree("aaa", "hhhhh");
        Tree tree2 = TreeFactory.createTree("aaa", "hhhhh");
        System.out.println(tree1);
        System.out.println(tree2);
    }
}
