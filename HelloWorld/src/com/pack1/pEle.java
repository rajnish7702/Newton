package com.pack1;

import java.util.Scanner;

public class pEle {
    public static void main(String[] args) {
        Scanner inputTacker = new Scanner(System.in);
        int n = inputTacker.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = inputTacker.nextInt();
        }
        long getPairElement = findPairElement(arr,n);
        System.out.println(getPairElement);
    }
    static long findPairElement(int[] arr, int n){
        int count = 0;
        if(n%2==0){
            for(int i=0;i<arr.length;i++){
                for(int j=n-1;j>0;j--){
                    if(arr[i]+arr[j]==n){
                        return arr[i]+arr[j];
                    }
                }
            }
        }
        return 0;
    }
}
