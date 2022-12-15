package com.pack1;

import java.util.Scanner;

/*
Closest Prime (Contest)
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an integer N, find the closest prime number to N. If there are multiple print the smaller one.
Input
The input contains a single integer N.

Constraints:
1 <= N <= 1000000000
Output
Print the closest prime to N.
Example
Sample Input 1
12

Sample Output 1
11

Explanation: Closest prime to 12 is 11 and 13 smaller of which is 11.

Sample Input 2
17

Sample Output 2
17

Explanation: Closest prime to 17 is 17.
 */
public class closestPrime {
    public static void main(String[] args) {
        Scanner inputTacker = new Scanner(System.in);
        int n = inputTacker.nextInt();
        int i = n-1;
        int j = n+1;
        while(n>= i || n<=j){
            if(chekPrime(n)){

            }
        }
    }
    public static boolean chekPrime(int n){
        for(int i = 2; i < Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
