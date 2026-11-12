package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class mapDemo2 {
    public static void main(String[] args) {
        //1、创建map集合的对象
        Map<String,String> map=new HashMap<>();
        //2、添加元素
        map.put("熊大","保护森林");
        map.put("熊二","吃蜂蜜");
        map.put("光头强","砍树");

        //3、通过键值对对象进行遍历
        //通过一个方法获取所有的键值对对象，返回一个set集合
        Set<Entry<String,String>> entries=map.entrySet();
        //遍历集合获取对象
//        for(Entry<String,String> entry:entries){
//            System.out.println(entry.getKey()+":"+entry.getValue());
//        }

        //迭代器遍历
//        Iterator<Entry<String,String>> it=entries.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next().getKey()+"="+it.next().getValue());
//        }

        //lamada遍历
        entries.forEach(entry-> System.out.println(entry.getKey()+"="+entry.getValue()));



    }
}
