package com.newton;
import java.util.Scanner;

/*
Rectangle
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Give integer values M and N. Using the character ‘*’ draw a rectangle of height M and breadth N.
Input
The input contains two integers M and N.

Constraints:-
3 <= M, N <= 20
Output
Print the rectangle as shown in the example
Example
Sample Input:-
3 3

Sample Output:-
***
* *
***

Sample Input:-
5 3

Sample Output:-
***
* *
* *
* *
***
 */
public class Rectangle {
    public static void main (String[] args)
    {
        Scanner inputTacker = new Scanner(System.in);
        int a=inputTacker.nextInt();
        int b=inputTacker.nextInt();

        for(int e=0; e<b; e++){
            System.out.print("*");
        }
        System.out.println();
        for(int i=0;i<a-2;i++)
        {
            System.out.print("*");
            for(int j=0;j<b-2;j++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for(int f=0; f<b; f++){
            System.out.print("*");
        }
    }
}
