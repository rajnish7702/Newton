package com.newton;
import java.util.*;
/*
Area of Square
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a side of a square, your task is to calculate its area.
Input
The first line of the input contains the side of the square.

Constraints:
1 <= side <=100
Output
You just have to print the area of a square
Example
Sample Input:-
3

Sample Output:-
9

Sample Input:-
6

Sample Output:-
36
Generate Expected Outputinfo-icon
Insert Input
 */
public interface AreaofSquare {
        public static void main (String[] args)
        {
            int n;
            Scanner sc=new Scanner(System.in);
            n=sc.nextInt();
            System.out.println(n*n);
        }
    }
