package com.newton;
import java.util.*;

/*
Rotate the matrix
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a matrix of N*N dimensions (Mat). Print the matrix rotated by 90 degree and 180 degree.
Input
First line contains N.
N lines follow each containing N space seperated integers.

2 <= N <= 100
1 <= Mat[i][j] <= 10000
Output
Output 2*N+1 lines.
First N lines should contain the Matrix rotated by 90 degrees.
Then print a blank line.
Then N lines should contain the Matrix rotated by 180 degrees.
Example
Sample Input
2
3 4
7 6

Sample Output
7 3
6 4

6 7
4 3

Sample Input:
2
1 2
3 4

Sample Output:
3 1
4 2

4 3
2 1
 */

public class RotateThematrix {
    public static void main (String[] args) {
        Scanner inputTaker = new Scanner(System.in);
        int n = inputTaker.nextInt();

        int[][] arr = new int[n][n];

        for(int i =0; i<n; i++){

            for(int j =0; j<n; j++){

                arr[i][j] = inputTaker.nextInt();

            }
        }

        //90 degree rotate
        rotateMatrix(arr, n);
        printMatrix(arr, n);
        System.out.println("");

        //again 90 degree rotate, hence 180 degree in total
        rotateMatrix(arr, n);
        printMatrix(arr, n);

    }

    public static void printMatrix(int[][] arr, int n){
        for(int i =0; i<n; i++){

            for(int j =0; j<n; j++){

                System.out.print(arr[i][j] + " ");

            }
            System.out.println("");
        }
    }


    public static void rotateMatrix(int[][] arr, int n){

        for(int i = 0; i< n/2; i++){ // number of boundaries


            for(int j = i; j < n-1-i; j++ ){

                int temp = arr[i][j];
                arr[i][j] = arr[n-1-j][i];
                arr[n-1-j][i] = arr[n-1-i][n-1-j];
                arr[n-1-i][n-1-j] = arr[j][n-1-i];
                arr[j][n-1-i] = temp;
            }


        }
    }
}
