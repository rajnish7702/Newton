/*
package com.pack3;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        sort(arr,0,n-1);
        //printing sorted array
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sort(int[] arr, int l,int h){
        if(l<h){
            int mid=l+(h-l)/2;
            sort(arr,l,mid);
            sort(arr,mid+1,h);
            merge(arr,l,mid,h);
        }

    }
    public static void merge(int[] arr, int l,int mid, int h){
        int n1=mid-l+1;
        int n2=h-mid;
        int[] left=new int[n1];
        int[] right=new int[n2];
        for(int i=0;i<n1;i++){
            left[i]= arr[l+i];
        }
        for(int i=0;i<n2;i++){
            right[i]=arr[mid+1+i];
        }
        int i=0;
        int j=0;
        int k=l;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k]=left[i++];
            }
            else {
                arr[k]=right[j++];
            }
            k++;
        }
        while(i<n1){
            arr[k++]=left[i++];
        }
        while(j<n2){
            arr[k++]=right[j++];
        }
    }
}
*/
