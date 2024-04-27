package org.crazyit.boot.c9.mix.impl;

import org.crazyit.boot.c9.mix.IEvent;
import org.crazyit.boot.c9.mix.IHandler;



/**
 * 节点事件的实现类
 *
 */
public class TagEvent implements IEvent {

    public void handle(IHandler handler) {
        System.out.println("策略实现类中处理节点事件");
        handler.handlerTag();        
    }
}
