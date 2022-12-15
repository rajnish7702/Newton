package com.pack1;
import javax.swing.plaf.IconUIResource;
import java.util.Scanner;
/*
Number of Primes - Easy Version
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a number n. Your task is to print the number of prime numbers before that number.
Input
The first line of the number of test cases T.
Next T lines contains the value of N.

Constraints
1 <= T <= 100
1 <= N <= 1000
Output
Print the number of primes numbers before that number.
Example
Sample Input 1:
3
10
19
4

Sample Output 1:
4
8
2
 */
public class numberofPrimes {
    public static void main(String[] args) {
        Scanner inputTacker = new Scanner(System.in);
        int t = inputTacker.nextInt();
        while(t>0){
            int n = inputTacker.nextInt();
            int count=0;
            for(int i = 2; i <= n; i++){
                if(checPrime(i)){
                    count++;
                }
            }
            System.out.println(count);
            t--;
        }
    }
    public static boolean checPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i ==0){
                return false;
            }
        }
        return true;
    }
}
