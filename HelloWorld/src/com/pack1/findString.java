package com.pack1;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class findString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            char[][] arr = new char[n][m];
            for(int i = 0;i< n; i++){
                for(int j = 0; j< m; j++){
                    arr[i][j]=sc.next().charAt(i + j);
                }
            }
            printFindString(arr,n,m);
            t--;
        }
    }
    static void printFindString(char[][] arr,int n,int m){
        int fist=0;
        for(int i = 0;i < n; i++){
            for(int j = 0; j<m; j++) {
                if (i <= n - 2) {
                    fist += arr[j][j-i];
                }
            }
        }
        System.out.println(fist);
    }
}
