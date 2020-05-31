package com.tsq.dp.adapter.objectadapter;

public class VoltageAdapter220To5 implements IVoltage5V {
    private Voltage220V voltage220V = new Voltage220V();

    @Override
    public int output5() {
        int srcV = voltage220V.output220();
        int distV = srcV / 44;
        return distV;
    }
}
