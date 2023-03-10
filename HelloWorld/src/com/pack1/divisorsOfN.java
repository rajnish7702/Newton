package com.pack1;
import java.util.Scanner;
/*
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an integer N, the task is to find the number of divisors of N which are divisible by 2.
Input
The input line contains T, denoting the number of testcases. First line of each testcase contains integer N

Constraints:
1 <= T <= 50
1 <= N <= 10^9
Output
For each testcase in new line, you need to print the number of divisors of N which are exactly divisble by 2
Example
Input:
2
9
8

Output
0
3
 */
public class divisorsOfN {
    public static void main (String[] args) {
        // Your code here
        Scanner inputTaker = new Scanner(System.in);
        int t = inputTaker.nextInt();
        while(t>0){
            int n = inputTaker.nextInt();
            System.out.println(getDivisorDivisibleBy2(n));
            t--;
        }
    }

    public static int getDivisorDivisibleBy2(int n){

        int count = 0;
        for(int i = 1; i<= Math.sqrt(n); i++){
            if(n % i == 0){

                if(i%2 == 0){
                    count++;
                }

                if(i*i != n){

                    if((n/i) % 2 == 0 ){
                        count++;
                    }
                }

            }
        }
        return count;
    }
}
