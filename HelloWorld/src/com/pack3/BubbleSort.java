package com.pack3;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={1,4,5,4};
        int target=1;
        binarSort(arr,target);
    }
    public static void binarSort(int arr[], int target){
        int l=0;
        int h= arr.length-1;
        while (l<=h){
            int m=l+(h-l)/2;
            if(arr[m]==target){
                System.out.print(m);
            }
            if(arr[m]>target){
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
    }
}
