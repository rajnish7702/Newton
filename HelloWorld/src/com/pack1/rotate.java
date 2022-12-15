package com.pack1;

import java.util.Scanner;

public class rotate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t>0){
            int n = input.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
            }
            rotateMatrix(arr, n);
            t--;
        }
    }
    public static void rotateMatrix(int[] arr, int n){
        int d=n/2;
        int p=1;
        while(p<=d){
            int last=arr[0];
            for(int i=0;i<n-1;i++){
                arr[i]=arr[i+1];
            }
            arr[n-1]=last;
            p++;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
