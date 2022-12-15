package com.newton;
import java.util.*;

/*
Matrix ZigZag Traversal
easy
hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a 2d matrix of size M*N, print the zig traversal of the matrix as shown:-

Consider a matrix of size 5*4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
17 18 19 20

ZigZag traversal:-

1
5 2
9 6 3
13 10 7 4
17 14 11 8
18 15 12
19 16
20
Input
First line of input contains two integers M and N. Next M lines contains N space- separated integers each.

Constraints:-
1 <= M, N <= 100
1 <= Matrix[i][j] <= 100000
Output
Print the zig- zag traversal of the matrix as shown.
Example
Sample Input:-
4 3
1 2 3
4 5 6
7 8 9
10 11 12

Sample Output:-
1
4 2
7 5 3
10 8 6
11 9
12
 */
public class MatrixZigZagTraversal {
    public static void main (String[] args) {
        // Your code here

        Scanner inputTaker = new Scanner(System.in);
        int n = inputTaker.nextInt();
        int m = inputTaker.nextInt();

        int[][] arr = new int[n][m];

        for(int i =0; i<n; i++){

            for(int j =0; j<m; j++){

                arr[i][j] = inputTaker.nextInt();

            }
        }

        //print upper half of primary diagonal in zig zag
        for(int i =0;i<n;i++){

            for(int j =i;j>=0;j--){
                if(i-j >= m){
                    //check bounds of columns
                    break;
                }
                System.out.print(arr[j][i - j] + " ");

            }
            System.out.println("");
        }


        //print lower half of primary diagonal in zig zag
        for(int i = 1;i< m ; i++){

            for(int j = n-1; j>=0; j--){
                if((i+(n-1-j)) >= m){
                    //check bounds of columns
                    break;
                }
                System.out.print(arr[j][i+(n-1-j)] + " ");
            }
            System.out.println("");

        }

    }
}
