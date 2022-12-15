package com.pack2;

import java.util.Scanner;

public class boundryTraverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0; i < n;i++){
            for(int j = 0; j < m; j++){
                arr[i][j]=input.nextInt();
            }
        }
        boundryTraverse(arr,n,m);
    }
    public static void boundryTraverse(int[][] arr,int n, int m){
        if(n==1)
        {
            for(int i=0;i<m;i++){
                System.out.print(arr[0][i]+" ");
            }
        } else if (m==1) {
            for(int i=0;i<n;i++){
                System.out.print(arr[i][0]+" ");
            }
        }
        else {
            // fist traverse
            for(int i=0;i<n;i++){
                System.out.print(arr[0][i]);
            }
            for(int i=1;i<m;i++){

            }
        }
    }
}
