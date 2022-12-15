package com.pack3;

import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        int []arr = {1 , 2 , 4, 5, 6, 4, 9,2};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }
        System.out.println(map.keySet());
    }
}
