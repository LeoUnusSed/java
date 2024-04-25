package com.hypech.corejava;

import java.util.ArrayList;
import java.util.List;

public class Stream02 {
    public static void main(String[] args) {
        //需求：1.拿到所有王姓  2.拿到名字长度为3个字的  3.打印
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("王五");
        list.add("王小二");
        list.add("王老五");
        list.add("李四");

        //stream流完成
        list.stream().filter(t->t.startsWith("王")).filter(t->t.length()==3).forEach(System.out::println);

    }
}
