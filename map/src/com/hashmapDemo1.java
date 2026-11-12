package com;

import java.util.HashMap;

public class hashmapDemo1 {
    public static void main(String[] args) {
        HashMap<Student,String> hash=new HashMap<>();
        hash.put(new Student("张三",18),"湖北");
        hash.put(new Student("李四",19),"湖南");
        hash.put(new Student("张三",18),"湖北");
        hash.put(new Student("王五",20),"河南");

        hash.forEach((k,v)-> System.out.println(k+"="+v));
    }
}
