package com.pack3;

import java.util.Scanner;

public class secondLargetArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        SecondLargetElement(arr,n);
    }
    public static void SecondLargetElement(int[] arr,int n){
        int max_i,s_max=-1;
        max_i=0;
        for(int i=0;i<n;i++){
            if(arr[max_i]<arr[i]){
                max_i=i;
            }
        }
        for(int i=0;i<n;i++){
            if(i==max_i){
                continue;
            }
            if(s_max==-1){
                s_max=i;
            }
            else if(arr[s_max]<arr[i]){
                s_max=i;
            }
        }
        System.out.println(arr[s_max]);
    }
}
