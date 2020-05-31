package com.tsq.dp.adapter.interfaceadapter;

public class ClientTest {
    public static void main(String[] args) {
        System.out.println("接口适配器模式======");
        EventListener eventListener = new EventListenerAdapter() {
            @Override
            public void onClick() {
                System.out.println("单击左键的实现！！！！！");
            }
        };
        eventListener.onClick();
    }
}
