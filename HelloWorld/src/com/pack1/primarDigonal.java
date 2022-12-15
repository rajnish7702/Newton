package com.pack1;

import java.util.Scanner;

public class primarDigonal {
    public static void main(String[] args) {
        Scanner inputTacker = new Scanner(System.in);
        int n=inputTacker.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=inputTacker.nextInt();
            }
        }
        primarDigonal(arr,n);
    }
    static void primarDigonal(int[][] arr,int n){
        int primaryDigonal =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    primaryDigonal+=arr[i][j];
                }
            }
        }
        System.out.println(primaryDigonal);
    }
}
