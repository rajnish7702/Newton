package com.pack1;
import java.util.Scanner;
public class booleanMatrix {
    public static void main (String[] args) {
        Scanner inputTacker = new Scanner(System.in);
        int t = inputTacker.nextInt();
        while(t>0){
            int n = inputTacker.nextInt();
            int m = inputTacker.nextInt();
            int[][] arr = new int[n][m];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    arr[i][j] = inputTacker.nextInt();
                }
            }
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    if(arr[i][j] == 1)
                    {
                        findColu(arr,i,m);
                    }
                }
            }
            for(int i = 0; i<n;i++){
                for(int j = 0;j<m;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            t--;
        }
    }
    static void findColu(int[][] arr,int n,int m)
    {
        for(int i=0;i<m;i++){
            arr[n][i]=1;
        }
    }
}
