package com.pack1;

import java.util.Scanner;
/*
Prime Sum
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a range from l to r, Your task is to find the sum of the second last digit of the prime numbers between that range.
Input
The first line of the input contains the T test cases.
Next T lines contains the range value l and r.

Constraints
1 <= T <= 100
1 <= l < r <= 1e5
Difference between l and r dosen't exceed 1e4.
Output
Print the required sum.
Example
Sample Input 1:
3
2 15
1 20
3 10

Sample Output 1:
2
4
0
 */
public class primeSum {
    public static void main(String[] args) {
        Scanner inputTacker = new Scanner(System.in);
        int t = inputTacker.nextInt();
        while(t>0){
            int l = inputTacker.nextInt();
            int r = inputTacker.nextInt();
            int count = 0;
            for(int i = l; i <= r; i++){
                if(checkPrime(i)){
                    count+=((i%100)/10);
                }
            }
            System.out.println(count);
            t--;
        }

    }
    public static boolean checkPrime(int n){
        for(int i= 2; i <= Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
