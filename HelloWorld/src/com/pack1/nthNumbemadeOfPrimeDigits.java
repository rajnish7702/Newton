package com.pack1;
/*
Problem Statement
Given a number 'N'. The task is to find the Nth number whose each digit is a prime number(<10) i.e 2, 3, 5, 7. In other words you have to find nth number of this sequence : 2, 3, 5, 7, 22, 23 ,.. and so on.
Input
The first line contains a single integer T i.e. the number of test cases. The first and only line of each test case consists of a single integer N.

Constraints:
1 <= T <= 100
1 <= N <= 100000
Output
For each testcase print the nth number of the given sequence made of prime digits in a new line.
Example
Input:
2
10
21

Output:
33
222

Explanation:
Testcase 1: 10th number in the sequence of numbers whose each digit is prime is 33.
Testcase 2: 21th number in the sequence of numbers whose each digit is prime is 222.

 */

import java.util.Scanner;

public class nthNumbemadeOfPrimeDigits {
    public static void main(String[] args) {
        Scanner inputTacker = new Scanner(System.in);
        int t = inputTacker.nextInt();
        while(t>0){
            int n = inputTacker.nextInt();
            for(int i=1;i<=n;i++){
                if(checkPrime(i)){
                    System.out.println(i);
                }
            }
            t--;
        }
    }
    public static boolean checkPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
