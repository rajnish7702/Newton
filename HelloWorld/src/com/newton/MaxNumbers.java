package com.newton;
import java.util.Scanner;

/*
Max numbers
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array A of size N, you need to find its maximum, 2nd maximum and 3rd maximum element.

Try solving it in O(N) per test case
Input
The first line of the input contains the number of test cases T.

For each test case, the first line of the input contains an integer N denoting the number of elements in the array A. The next line contains N (space separated) elements of A.


Constraints:
1 <= T <= 100
3 <= N <= 10^6
1 <= A[i] <= 10^9

Note:-It is guaranteed that the sum of N over all text cases does not exceed 10^6
Output
For each test case, output the first, second and third maximum elements in the array.
Example
Sample Input:
3
5
1 4 2 4 5
6
1 3 5 7 9 8
7
11 22 33 44 55 66 77

Sample Output:
5 4 4
9 8 7
77 66 55

Explanation(might now be the optimal solution):
Testcase 1:
[1 4 2 4 5]
First max = 5
Second max = 4
Third max = 4
 */
public class MaxNumbers {
    public static void main (String[] args) {
        // Your code here
        Scanner inputTaker = new Scanner(System.in);
        int t = inputTaker.nextInt();
        while(t > 0){
            int n = inputTaker.nextInt();
            int[] arr = new int[n];
            for(int x =0;x<n;x++){
                arr[x] = inputTaker.nextInt();
            }
            printNumbers(arr);
            t--;
        }
    }

    public static void printNumbers(int[] arr){
        int max_i, s_max_i = -1, t_max_i = -1;

        max_i =0;

        //find index of highest number
        for(int x =0; x < arr.length ; x++){

            if(arr[max_i] < arr[x]){
                max_i = x;
            }
        }

        //find index of second highest number
        for(int x =0; x < arr.length ; x++){

            if(x == max_i){
                continue;
            }
            if(s_max_i == -1){
                s_max_i = x;
            }else if(arr[s_max_i] < arr[x]){
                s_max_i = x;
            }
        }


        //find index of third highest number
        for(int x =0; x < arr.length ; x++){

            if(x == max_i || x == s_max_i){
                continue;
            }

            if(t_max_i == -1){
                t_max_i = x;
            }else if(arr[t_max_i] < arr[x]){
                t_max_i = x;
            }
        }
        System.out.println(arr[max_i] + " " + arr[s_max_i] + " " + arr[t_max_i]);
    }
}
