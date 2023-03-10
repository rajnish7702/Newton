package com.newton;
import java.util.*;

/*
GCD
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given 2 non-negative integers m and n, find gcd(m, n)
GCD of 2 integers m and n is defined as the greatest integer g such that g is a divisor of both m and n. Both m and n fit in a 32 bit signed integer.

NOTE: DO NOT USE LIBRARY FUNCTIONS
Input
Input contains two space separated integers, m and n

Constraints:-
1 < = m, n < = 10^18
Output
Output the single integer denoting the gcd of the above integers.
Example
Sample Input:
6 9

Sample Output:
3

Sample Input:-
5 6

Sample Output:-
1
 */
public class GCD {
    public static void main (String[] args) {
        Scanner inputTacker = new Scanner(System.in);
        long m = inputTacker.nextLong();
        long n = inputTacker.nextLong();
        System.out.println(gcd(m,n));
    }
    public static long gcd(long m, long n){
        if(m>n){
            if(m%n==0){
                return n;
            }
        }
        return gcd(n,m%n);
    }
}
