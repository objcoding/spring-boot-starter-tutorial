package com.objcoding.startersamples.flymq;

import com.objcoding.flymq.core.HandlerTask;

/**
 * Created by chenghui.zhang on 2018/1/31.
 */
public class TestEventHandler extends HandlerTask<TestMessage> {
    public TestEventHandler() {
        super(TestMessage.class);
    }

    // 实现handle方法
    @Override
    public boolean handle(TestMessage message) {
        System.out.println("execute hanlde >>> " + this.getClass().getName() + message.getEvent());
        return true;
    }
}
