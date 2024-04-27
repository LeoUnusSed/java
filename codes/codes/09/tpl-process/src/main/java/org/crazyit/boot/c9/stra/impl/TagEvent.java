package org.crazyit.boot.c9.stra.impl;

import org.crazyit.boot.c9.stra.IEvent;

/**
 * 节点事件的实现类
 *
 */
public class TagEvent implements IEvent {

    public void handle() {
        System.out.println("处理节点事件");
    }
}
