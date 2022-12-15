package com.newton;
import java.util.Scanner;

/*
Simple Input- String
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a string S, your task is to take input of the given string and print the same string.
Input
The input contains a single string S.
Output
Print the string S.
Example
Sample Input:-
NewtonSchool

Sample Output:-
NewtonSchool

Sample Input:-
Hello

Sample Output:-
Hello
 */
public class SimpleInputString {
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(s);
        sc.close();
    }
}
