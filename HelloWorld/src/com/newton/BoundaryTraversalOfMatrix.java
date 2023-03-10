package com.newton;
import java.util.*;

/*
Boundary Traversal of Matrix
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a matrix A of dimensions n x m. The task is to perform boundary traversal on the matrix in clockwise manner.
Input
The first line of input contains T denoting the number of testcases. T testcases follow. Each testcase two lines of input. The first line contains dimensions of the matrix A, n and m. The second line contains n*m elements separated by spaces.

Constraints:
1 <= T <= 100
1 <= n, m <= 30
0 <= A[i][j] <= 100
Output
For each testcase, in a new line, print the boundary traversal of the matrix A.
Example
Input:
4
4 4
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
3 4
12 11 10 9 8 7 6 5 4 3 2 1
1 4
1 2 3 4
4 1
1 2 3 4

Output:
1 2 3 4 8 12 16 15 14 13 9 5
12 11 10 9 5 1 2 3 4 8
1 2 3 4
1 2 3 4

Explanation:
Testcase1: The matrix is:
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
The boundary traversal is 1 2 3 4 8 12 16 15 14 13 9 5
Testcase 2: Boundary Traversal will be 12 11 10 9 5 1 2 3 4 8.
Testcase 3: Boundary Traversal will be 1 2 3 4.
Testcase 4: Boundary Traversal will be 1 2 3 4.
 */

public class BoundaryTraversalOfMatrix {
    public static void main (String[] args) {
        // Your code here
        Scanner inputTaker = new Scanner(System.in);
        int t = inputTaker.nextInt();

        while(t>0){
            int n = inputTaker.nextInt();
            int m = inputTaker.nextInt();

            int[][] arr = new int[n][m];

            for(int i =0; i<n; i++){

                for(int j =0; j<m; j++){

                    arr[i][j] = inputTaker.nextInt();

                }
            }
            printBoundary(arr, n, m);
            System.out.println("");
            t--;
        }
    }

    public static void printBoundary(int[][] arr, int n, int m){

        if(n==1){

            for(int i =0; i<m; i++){
                System.out.print(arr[0][i] + " ");
            }

        }else if(m == 1){

            for(int i = 0; i<n; i++){
                System.out.print(arr[i][0] + " ");
            }

        }else{

            //first row
            for(int i =0; i<m; i++){
                System.out.print(arr[0][i] + " ");
            }

            //last column without first number
            for(int i =1; i<n; i++){
                System.out.print(arr[i][m-1] + " ");
            }

            //last row without last number
            for(int i = m-2; i>=0; i--){
                System.out.print(arr[n-1][i] + " ");
            }

            //first column without first and last number
            for(int i = n-2; i>0; i--){
                System.out.print(arr[i][0] + " ");
            }
        }
    }
}
