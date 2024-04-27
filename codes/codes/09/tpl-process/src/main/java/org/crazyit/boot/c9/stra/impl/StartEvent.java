package org.crazyit.boot.c9.stra.impl;

import org.crazyit.boot.c9.stra.IEvent;

/**
 * 开始实现类
 */
public class StartEvent implements IEvent {

    public void handle() {
        System.out.println("处理开始事件");
    }
}
