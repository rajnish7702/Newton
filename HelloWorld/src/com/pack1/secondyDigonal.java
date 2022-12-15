package com.pack1;

import java.util.Scanner;

public class secondyDigonal {
    public static void main(String[] args) {
        Scanner inputTacker = new Scanner(System.in);
        int n=inputTacker.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=inputTacker.nextInt();
            }
        }
        printSecondry(arr,n);
    }
    static void printSecondry(int[][] arr,int n){
        int secondy=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j ==n-1){
                   secondy+=arr[i][j];
                }
            }
        }
        System.out.println(secondy);
    }
}
