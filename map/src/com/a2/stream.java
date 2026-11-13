package com.a2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class stream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);
        System.out.println(list.stream().filter(s->s%2!=0).toList());


    }
}
