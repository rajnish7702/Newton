package com.newton;
import java.util.Scanner;

/*
Mohit and array
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Mohit has an array of N integers containing all elements from 1 to N, somehow he lost one element from the array.
Given N-1 elements your task is to find the missing one.
Input
First line of input contains a single integer N, the next line contains N-1 space separated integers.

Constraints:-
1 < = N < = 1000
1 < = elements < = N
Output
Print the missing element
Example
Sample Input:-
3
3 1

Sample Output:
2

Sample Input:-
5
1 4 5 2

Sample Output:-
3
 */
public class MohitAndArray {
    public static void main (String[] args) {
        Scanner inputTacker = new Scanner(System.in);
        int n = inputTacker.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n-1;i++)
        {
            arr[i] = inputTacker.nextInt();
        }
        int sum=0;
        for(int i = 0;i<n-1;i++)
        {
            sum=sum+arr[i];
        }
        int total=(n*(n+1))/2;
        System.out.println(total-sum);
    }
}
