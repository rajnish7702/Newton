package com.pack1;

import java.util.Scanner;

public class Rotation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        System.out.print(rotate(arr,n));
    }
    public static int rotate(int[] arr, int n){
        int l = 0;
        int h = arr.length-1;
        while(l<=h){
            int mid = l+(h-l)/2;
            int next = (mid+1)%n;
            int prev = (mid+n-1)%n;
            if(arr[mid]<arr[next] && arr[mid]<arr[prev]){
                return mid;
            }
            if(arr[mid]>=arr[l]){
                h=mid+1;
            } else if (arr[mid]<=arr[h]) {
                l=mid-1;
            }
        }
        return l;
    }
}
