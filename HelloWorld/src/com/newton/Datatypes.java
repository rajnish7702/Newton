package com.newton;
import java.io.*;
import java.util.Scanner;
import java. util. Formatter;
import java.util.Locale;
/*
Data types
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Some Data types are given below:-
Integer
Long
float
Double
char
Your task is to take input in the given format and print them in the same order.
Input
The input contains the following values separated by lines:- integer, Long, float, double, char
Output
Print each element in a new line in the same order as input.

Note:- Print float round off to two decimal places and double to 4 decimal places.
Example
Sample Input:-
2
2312351235
1.21
543.1321
c

Sample Output:-
2
2312351235
1.21
543.1321
c
 */
public class Datatypes {
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        long l=sc.nextLong();
        float f=sc.nextFloat();
        double d=sc.nextDouble();
        char c=sc.next().charAt(0);
        System.out.println(i);
        System.out.println(l);
        //System.out.println(String.formate("%.2f",f));
        //System.out.printf("%.2f",f);
        //System.out.println(" ");
        //System.out.printl(String.formate("%.4f",d));
        //System.out.printf("%.4f",d);
        //System.out.println(" ");
        System.out.println(c);
    }
}
