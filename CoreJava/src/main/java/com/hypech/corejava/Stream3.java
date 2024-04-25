package com.hypech.corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class Stream3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        //第一种：通过集合对象调用stream
        Stream<String> stream = list.stream();//获取Stream流
        stream.forEach(System.out::println);  //打印

        //第二种：通过Arrays获取stream流对象
        String[] arr = {};
        Stream<String> stream1 = Arrays.stream(arr);

        //第三种：通过Stream流里面of方法
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);


        //上面三种流都是串行流。    并行流：
        Stream<String> stringStream = list.parallelStream();
        stringStream.forEach(System.out::println);
    }
}