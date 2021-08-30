package com.moko.support.h6.task;

import com.moko.ble.lib.task.OrderTask;
import com.moko.support.h6.entity.OrderCHAR;

public class GetAdvTxPowerTask extends OrderTask {

    public byte[] data;

    public GetAdvTxPowerTask() {
        super(OrderCHAR.CHAR_ADV_TX_POWER, OrderTask.RESPONSE_TYPE_READ);
    }

    @Override
    public byte[] assemble() {
        return data;
    }
}
