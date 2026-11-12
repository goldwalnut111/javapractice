package com;

import java.util.HashMap;
import java.util.Map;

public class mapDemo3 {
    public static void main(String[] args) {
        //1、创建map集合的对象
        Map<String, String> map = new HashMap<>();
        //2、添加元素
        map.put("熊大", "保护森林");
        map.put("熊二", "吃蜂蜜");
        map.put("光头强", "砍树");

        //3、利用lamada表达式进行遍历
        map.forEach((k, v) -> System.out.println(k + "=" + v));//accept方法
    }
}