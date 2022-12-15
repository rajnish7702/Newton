package com.newton;
import java.util.Scanner;

/*
Checking a Number
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Write a program to check whether a number is positive, negative or zero using switch case.
Input
The first line of the input contains the number

Constraints
-1e9 <= n <= 1e9
Output
Print the single line wether it's "Positive", "Negative" or "Zero"
Example
Sample Input :
13

Sample Output :
Positive

Sample Input :
-13

Sample Output :
Negative
 */
public class CheckingNumber {
    public static void main (String[] args)
    {
        Scanner inputTacker=new Scanner(System.in);
        int n=inputTacker.nextInt();
        if(n>0)
        {
            System.out.println("Positive");
        }
        else if(n<0)
        {
            System.out.println("Negative");
        }
        else
        {
            System.out.println("Zero");
        }
    }
}
