package com.pack3;

import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,1,3};
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        System.out.println(hs);
    }

}
