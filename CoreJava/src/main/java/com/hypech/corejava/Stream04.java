//https://blog.csdn.net/WQGuang/article/details/131202997
package com.hypech.corejava;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.Optional;
import java.util.stream.Collectors;


public class Stream04 {
    public static void main(String[] args) {
        //举个简单的例子：
        //假设有一个Person类和一个Person列表
        // 现在有两个需求：1）找到年龄大于18岁的人并输出；2）找出所有中国人的数量
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("欧阳雪", 18, "中国", 'F'));
        personList.add(new Person("Tom", 24, "美国", 'M'));
        personList.add(new Person("Harley", 22, "英国", 'F'));
        personList.add(new Person("向天笑", 20, "中国", 'M'));
        personList.add(new Person("李康", 22, "中国", 'M'));
        personList.add(new Person("小梅", 20, "中国", 'F'));
        personList.add(new Person("何雪", 21, "中国", 'F'));
        personList.add(new Person("李康", 22, "中国", 'M'));
        //1. 年龄大于18  filter:过滤掉不满足条件的元素.  forEach:输出元素. ---如果没有终止函数，那么中间函数的代码不会被执行。
        personList.stream().filter(item -> {
            System.out.println("=======");
            return item.getAge() > 18;
        }).forEach(System.out::println);

        //2. 找出中国人  并统计个数: count()
        long count1 = personList.stream().filter(item -> item.getCountry().equals("中国")).count();
        System.out.println("中国人:" + count1);

        //找出年龄最大和最小
        Person person = personList.stream().max(((o1, o2) -> o1.getAge() - o2.getAge())).get();
        Person person2 = personList.stream().min(((o1, o2) -> o1.getAge() - o2.getAge())).get();
        System.out.println(person);
        System.out.println(person2);

        //把Person-年龄大于20人--里面名称----新的集合。
        List<String> collect = personList.stream().filter(item -> item.getAge() > 20).map(item -> item.getName()).collect(Collectors.toList());
        System.out.println(collect);


//sorted排序 按照年龄从小到大排序
        List<Person> collect2 = personList.stream().sorted((o1, o2) -> o1.getAge() - o2.getAge()).collect(Collectors.toList());
        System.out.println(collect2);

//findFirst(): 返回流中的第一个元素，如果流为空则返回一个空的Optional对象。
        Optional<Person> first = personList.stream().filter(item->item.getAge()>=20&&item.getAge()<=24).findFirst();
        System.out.println(first.get());

        //findAny(): 返回流中的任意一个元素，如果流为空则返回一个空的Optional对象
        Optional<Person> any = personList.stream().filter(item -> item.getAge() > 20).findAny();
        System.out.println(any.get());


        //anyMatch 判断流中是否存在满足指定条件的元素，一旦找到满足条件的元素，立即返回true，不再继续处理剩余元素。
        //判断有没有姓名为小梅的
        boolean b = personList.stream().anyMatch(a -> a.getName().equals("小梅"));
        System.out.println(b);

        //allMatch 判断流中的所有元素是否都满足指定条件，一旦发现有不满足条件的元素，立即返回false，不再继续处理剩余元素。
        //判断是不是所有姓名都叫小梅
        boolean b2 = personList.stream().allMatch(a -> a.getName().equals("小梅"));
        System.out.println(b2);
    }
}


@Data
@NoArgsConstructor
@AllArgsConstructor
class Person {
    private String name;
    private Integer age;
    private String country;
    private char sex;
}