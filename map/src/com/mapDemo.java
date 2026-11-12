package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class mapDemo {
    public static void main(String[] args) {
        //用三种方式遍历map集合
        //1、创建map集合对象
        Map<String,String> map=new HashMap<>();

        //2、添加元素
        map.put("熊大","森林");
        map.put("熊二","蜂蜜");
        map.put("光头强","砍树");

        //3、通过键找值

        Set<String> keys = map.keySet();
//        for (String key : keys) {
//            System.out.println(key+"="+map.get(key));
//        }

//        Iterator<String> it=keys.iterator();//list和set里面有迭代器
//        while(it.hasNext()){
//            String key=it.next();
//            System.out.println(key+"="+map.get(key));
//        }

        keys.forEach(key-> System.out.println(key+"="+map.get(key)));


    }
}
