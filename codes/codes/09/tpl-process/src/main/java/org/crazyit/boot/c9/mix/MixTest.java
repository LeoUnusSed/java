package org.crazyit.boot.c9.mix;

import java.util.ArrayList;
import java.util.List;

import org.crazyit.boot.c9.mix.impl.HandlerA;
import org.crazyit.boot.c9.mix.impl.HandlerB;
import org.crazyit.boot.c9.mix.impl.StartEvent;
import org.crazyit.boot.c9.mix.impl.TagEvent;

public class MixTest {

    public static void main(String[] args) {
        // 创建解析事件
        IEvent startEvent = new StartEvent();
        IEvent tagEvent = new TagEvent();
        List<IEvent> events = new ArrayList<IEvent>();
        events.add(startEvent); 
        events.add(tagEvent);
        // 初始化责任链
        IHandler handlerA = new HandlerA();
        IHandler handlerB = new HandlerB();
        handlerA.setNext(handlerB);
        // 执行责任链
        EventContext ctx = new EventContext(events, handlerA);
        ctx.process();
    }
}
