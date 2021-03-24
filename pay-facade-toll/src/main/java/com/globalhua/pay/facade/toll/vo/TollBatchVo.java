package com.globalhua.pay.facade.toll.vo;

import com.globalhua.pay.facade.toll.entity.TollBatch;
import com.globalhua.pay.facade.toll.entity.TollBatchFlow;

public class TollBatchVo extends TollBatch {
    protected TollBatchFlow flow;

    public TollBatchFlow getFlow() {
        return flow;
    }

    public void setFlow(TollBatchFlow flow) {
        this.flow = flow;
    }
}
