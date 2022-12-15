package com.pack2;

import java.util.stream.StreamSupport;

public class findFistAndLastPosiotnOfArray {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target=8;
        findTarget(arr,0, arr.length-1,target);
    }
    public static void  findTarget(int[] arr,int low,int high,int target){
        if(low>high){
            System.out.println(-1);
            //return;
        }
        int mid=low+(high-low)/2;
        if(arr[mid]==target){
            System.out.println(mid);
            return;
        }
        if(arr[mid]>target){
            findTarget(arr,low,mid,target);
        }
        else {
            findTarget(arr, mid + 1, high, target);
        }
    }
}
