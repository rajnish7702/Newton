package com.pack1;

import java.util.Scanner;


    /*
     Problem Statement
     Given a boolean matrix of size N*M in which each row is sorted your task is
     to print the index of the row containing maximum 1's. If multiple answer exist print the smallest one.
     Input
     First line contains two space separated integers denoting values of N and M. Next N lines
      contains M space separated integers depicting the values of the matrix.

     Constraints:-
     1 < = M, N < = 1000
     0 < = Matrix[][] < = 1
     Output
     Print the smallest index (0 indexing) of a row containing the maximum number of 1's.
     Example
     Sample Input:-
     3 5
     0 1 1 1 1
     0 0 0 1 1
     0 0 0 1 1

     Sample Output:-
     0

     Sample Input:-
     4 4
     0 1 1 1
     1 1 1 1
     0 0 1 1
     1 1 1 1

     Sample Output:-
     1
     */
    public class rowWithMax {
    public static void main(String[] args) {
        Scanner inputTacker = new Scanner(System.in);
        int n = inputTacker.nextInt();
        int m = inputTacker.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = inputTacker.nextInt();
            }
        }
        printRowMinIndex(arr,n,m);
    }
    public static void printRowMinIndex(int[][] arr, int n, int m){
        int count = 0;
        int index = 0;
        for(int i = 0; i < n; i++){
            count=0;
            for(int j = 0; j < m ;j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
            if(count == m){
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
