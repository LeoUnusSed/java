package org.crazyit.boot.c9.stra;

import java.util.ArrayList;
import java.util.List;

import org.crazyit.boot.c9.stra.impl.StartEvent;
import org.crazyit.boot.c9.stra.impl.TagEvent;

public class StraTest {

    public static void main(String[] args) {
        // 创建策略
        IEvent startEvent = new StartEvent();
        IEvent tagEvent = new TagEvent();
        List<IEvent> events = new ArrayList<IEvent>();
        events.add(startEvent);
        events.add(tagEvent);
        // 创建客户端，传入策略
        EventContext ctx = new EventContext(events);
        // 执行处理方法
        ctx.process();
    }
}
