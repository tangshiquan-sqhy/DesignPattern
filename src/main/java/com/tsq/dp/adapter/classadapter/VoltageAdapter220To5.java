package com.tsq.dp.adapter.classadapter;

public class VoltageAdapter220To5 extends Voltage220V implements IVoltage5V {

    @Override
    public int output5() {
        int srcV = super.output220();
        int distV = srcV / 44;
        return distV;
    }
}
