package com.pack2;
import  java.util.*;
import java.lang.reflect.Array;
import java.util.Scanner;

public class twoPointer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t > 0) {
            int n = input.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }
            sortArrays(n,arr);
            t--;
        }
    }
    public static void sortArrays(int n ,int[] arr){
        int numberToBesort = sort(arr,0,n-1);
        // printTing values;
        int i=0;
        while (i<n){
            System.out.print(arr[i]*arr[i]+" ");
            i++;
        }
    }
    public static int sort(int[] arr,int l,int h){
        if(l<h){
            int mid = l+(h-l)/2;
            int sortLeft=sort(arr,l,mid);
            int sortRight=sort(arr,mid+1,h);
            merge(arr,l,mid,h);
            return sortRight+sortLeft+1;
        }
        return 0;
    }
    public static void merge(int[] arr,int l,int mid,int h){
        int n1 = mid - l + 1;
        int n2=h-mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for(int i=0;i<n1;i++){
            left[i]=arr[l+i];
        }
        for(int i=0;i<n2;i++){
            right[i]=arr[mid+1+i];
        }
        int i=0;
        int j=0;
        int k=l;
        while(i<n1 && j<n2){
            if(left[i] <= right[j]){
                arr[k]=left[i];
                i++;
            }
            else {
                arr[k]=right[j++];
                //j++;
            }
            k++;
        }
        while(i < n1){
            arr[k]=left[i];
            k++;
            i++;
        }
        while(j < n2){
            arr[k] = right[j];
            k++;
            j++;
        }
    }
}
