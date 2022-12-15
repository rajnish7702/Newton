package com.newton;
import java.util.*;

/*
Closest Prime (Contest)
easy
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
public class ClosestPrime {
    public static void main (String[] args) {
        // Your code here
        Scanner s = new Scanner(System.in);
        long n = s.nextInt();

        for (int i=1;i<n;i++){
            if (checkPrime(n)) {
                System.out.println(n);
                break;
            }
            long number1 = n + i;
            long number2 = n - i;

            if (checkPrime(number1) && checkPrime(number2)){
                System.out.println(Math.min(number1,number2));
                break;
            }

            if (checkPrime(number1)){
                System.out.println(number1);
                break;
            }
            if (checkPrime(number2)){
                System.out.println(number2);
                break;
            }

        }

    }

    public static boolean checkPrime(long n) {
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0)
                return false;
        }
        return true;
    }
}
