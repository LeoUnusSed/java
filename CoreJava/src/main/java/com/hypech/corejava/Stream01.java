package com.hypech.corejava;

import java.util.ArrayList;
import java.util.List;

public class Stream01 {
    public static void main(String[] args) {
        //需求：1.拿到所有王姓  2.拿到名字长度为3个字的  3.打印
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("王五");
        list.add("王小二");
        list.add("王老五");
        list.add("李四");

        //1.拿到王姓
        List<String> list01 = new ArrayList<>();
        for (String n : list){
            if (n.startsWith("王")){  //startsWith：开头为王
                list01.add(n);
            }
        }

        //2.拿到名字长度为3个字的
        List<String> list02 = new ArrayList<>();
        for (String n : list01){
            if (n.length()==3){  //长度为3个字的
                list02.add(n);
            }
        }

        //3.打印
        for (String s : list02){
            System.out.println(s);
        }

    }
}

