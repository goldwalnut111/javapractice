package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class hashmapDemo2 {
    public static void main(String[] args) {
        String []a=new String[]{"A","B","C","D"};
        Random random=new Random();
        List<String> list=new ArrayList();
        for (int i = 0; i < 80; i++) {
            int index=random.nextInt(4);
            list.add(a[index]);
        }

        //统计
        HashMap<String,Integer> map=new HashMap<>();
        int maxi=0;
        for(String s:list){
            if(!map.containsKey(s)){
                map.put(s,1);
            } else {
                map.put(s,map.get(s)+1);

            }

            if(map.get(s)>maxi){
                maxi=map.get(s);
            }

        }
        for(String s:list){
            if(map.get(s)==maxi) {
                System.out.println(s);
                return;
            }

        }
    }
}
