package com.newton;
import java.util.Scanner;

/*
Print the input!
easy
Problem Statement
Take an integer as input and print it.
Input
The first line contains integer as input.

Constraints
1 <= N <= 10
Output
Print the input integer in a single line
Example
Sample Input:-
2

Sample Output:-
2

Sample Input:-
4

Sample Output:-
4
 */
public class Printtheinput {
    public static void main (String[] args)
    {
        Scanner inputTaker=new Scanner(System.in);
        int n=inputTaker.nextInt();
        System.out.println(n);
    }
}
