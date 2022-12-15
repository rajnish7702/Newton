package com.pack1;

import java.util.Scanner;
/*
GCD frequency
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an integer array A of size N. Find the sum of GCD (Greatest Common Divisor) of all elements with their frequency.
Input
First line contains an integers N.
Next line contains N space separated integers denoting elements of array.

Constraints
1 <= N <= 1000
0 <= Ai<= 10^5
Output
Print the sum of GCD of all elements with their frequency.
Example
Sample Input 1:
3
1 2 3

Output
3

Explanation:
gcd(1, 1) + gcd(2, 1) + gcd(3, 1) = 1+1+1 = 3

Sample Input 2:
6
3 6 6 9 3 3

Output
14

Explanation
gcd(3, 3) + gcd(6, 2) + gcd(6, 2) + gcd(9, 1) + gcd(3, 3) + gcd(3, 3)= 3+2+2+1+3+3= 14
 */
public class GCDfrequency {
    static int findGCDSum(int n, int arr[])
    {
        int GCDSum = 0;
        int tempGCD = 0;
        for (int i = 0; i < n; i++)
        {
            // Fixing the starting index of a subarray
            for (int j = i; j < n; j++)
            {
                // Fixing the ending index of a subarray
                tempGCD = 0;
                for (int k = i; k <= j; k++)
                {
                    // Finding the GCD of this subarray
                    tempGCD = gcd(tempGCD, arr[k]);
                }

                // Adding this GCD in our sum
                GCDSum += tempGCD;
            }
        }
        return GCDSum;
    }

    static int gcd(int a, int b)
    {
        return b == 0 ? a : gcd(b, a % b);
    }

    // Driver Code
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int totalSum = findGCDSum(n, arr);
        System.out.print(totalSum + "\n");
    }
}