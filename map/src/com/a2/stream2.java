package com.a2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;

public class stream2 {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        Collections.addAll(list,"zhangsan,23","lisi,24","wangwu,25");
        System.out.println(list.stream()
                .filter(s->parseInt(s.split(",")[1])>=24)
                .collect(Collectors.toMap(s->s.split(",")[0], s->s.split(",")[1])));
    }
}
