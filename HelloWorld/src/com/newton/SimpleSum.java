package com.newton;
import java.util.Scanner;
/*
Simple Sum
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given three integers A, B, and C, your task is to print the sum of these three integers.
Input
The input contains 3 integers separated by spaces A, B, and C.

Constraints:-
1 <= A, B, C <= 100
Output
Print the sum of A, B and C.
 */
public class SimpleSum {
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(a+b+c);
    }
}
