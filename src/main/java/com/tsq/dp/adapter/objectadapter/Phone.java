package com.tsq.dp.adapter.objectadapter;

public class Phone {
    public void charging(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5() == 5) {
            System.out.println("输出电压为5V，可以充电！！");
        } else {
            System.out.println("输出电压不是5V，不能充电！！！");
        }
    }
}
