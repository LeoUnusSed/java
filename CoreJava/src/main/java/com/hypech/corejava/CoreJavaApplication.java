package com.hypech.corejava;

import java.util.ArrayList;
import java.util.List;

public class CoreJavaApplication {
    public static void main(String[] args) {

        Stream1 demo1 = new Stream1();
        demo1.Stream2();
    }
}

class Stream1 {
    public void Stream2() {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(null);
        list.add(3);
        list.add(null);
        long l=list.stream().filter(nums->nums !=null).count();
        System.out.println(l);//我们的预期是:2
    }
}