package com.pack1;

import java.util.Scanner;

public class primaryTryDigonal {
    public static void main(String[] args) {
        Scanner inputTacker = new Scanner(System.in);
        int n=inputTacker.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=inputTacker.nextInt();
            }
        }
        int primarTryD=0;
        int secondtryTryD=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<=j){
                    primarTryD+=arr[i][j];
                }
                if(i>=j){
                    secondtryTryD+=arr[i][j];
                }
            }
        }
        System.out.println(primarTryD+" "+secondtryTryD);
    }
}
