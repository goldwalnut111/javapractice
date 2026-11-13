package com.a2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.lang.Integer.parseInt;
import static java.util.stream.Collectors.toList;

public class stream3 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list1,"张三,21","光头强,22","王大五,23","熊大大,18","熊二二,17");
        Collections.addAll(list2,"小红,22","杨威,21","杨洋,18","熊大,18","熊二,17");
        Stream<String> limit1 = list1.stream().filter(s -> (s.split(",")[0]).length() == 3).limit(2);
        Stream<String> limit2 = list2.stream().filter(s -> (s.split(",")[0]).startsWith("杨")).skip(1);
        List<actor> list3 = Stream.concat(limit1, limit2)
                .map(s-> new actor(s.split(",")[0],parseInt(s.split(",")[1]))).toList();
        System.out.println(list3);
    }
}
