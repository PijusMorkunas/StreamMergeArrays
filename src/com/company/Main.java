package com.company;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add("one");
        list1.add("two");
        list1.add("three");
        list2.add("pijus");
        list2.add("dota");
        list2.add("simba");
        List<String> newList = new ArrayList<>();
//        for (int i = 0; i < list1.size(); i++) {
//            newList.add(list1.get(i));
//            newList.add(list2.get(i));
        List<String> stringList = Stream.of(list1, list2)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        stringList.forEach(System.out::println);
    }
}