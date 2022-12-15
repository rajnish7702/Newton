package com.newton;
import java.util.Scanner;

/*
Maximum difference array
medium
hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of integers of size N, your task is to find the maximum parity index of this array.
Parity Index is the maximum difference between two indices i and j (1 <= i <= j <= N) of an array A such that Ai < Aj.
Input
First line of contains a single integer N, next line contains N space separated integers depicting the values of array.

Constraints:-
1 < = N < = 100000
1 < = Arr[i] < = 100000
Output
Print the maximum value of j- i under the given condition, if no pair satisfies the condition print -1.
Example
Sample Input:-
5
1 2 3 4 5

Sample Output:-
4

Explanation:
The maximum difference of jth - ith index is 4:(4th - 0th), also arr[4] > arr[0]


Sample Input:-
5
5 4 3 2 1

Sample Output:-
-1
 */
public class MaximumDifferenceArray {
    public static void main (String[] args) {
        // Your code here
        Scanner inputTaker = new Scanner(System.in);
        int n = inputTaker.nextInt();

        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = inputTaker.nextInt();
        }

        int[] leftMin = new int[n];
        int[] rightMax = new int[n];

        leftMin[0] = arr[0];
        for(int i =1;i<n;i++){
            leftMin[i] = Math.min(arr[i], leftMin[i-1]);
        }

        rightMax[n-1] = arr[n-1];
        for(int i =n-2;i>=0;i--){
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }

        int i =0;
        int j =0;
        int maxDiff = -1;

        while(i <n && j < n){

            if(leftMin[i] < rightMax[j]){
                maxDiff = Math.max(maxDiff, j -i);
                j++;
            }else{
                i++;
            }

        }

        System.out.println(maxDiff);

    }
}
