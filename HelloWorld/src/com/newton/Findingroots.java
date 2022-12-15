package com.newton;
import  java.util.Scanner;

/*
Finding roots
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Write a program to find roots of a quadratic equation using switch case.
Input
The first line of the input contains the three float values a, b, and c of equation ax^2 + bx + c.

Constraints
1<= a, b, c <= 50
Output
Print the two roots in two different lines and for imaginary roots print real and imaginary part of one root with (+/- and i )sign in between in one line and other in next line. For clarity see sample Output 2.

Note Imaginary roots can also be there and roots are considered upto 2 decimal places.
Example
Sample Input 1 :
4 -2 -10

Sample Output 2 :
1.85
-1.35

Sample Input 2 :
2 1 10

Sample Output 2:
-0.25+i2.22
-0.25-i2.22
 */
public class Findingroots {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);

        double a , b , c ;
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        double root1, root2;
        double determinant = b * b - 4 * a * c;

        if (determinant > 0) {
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.format("%.2f", root1);
            System.out.format("\n%.2f", root2);
        }
        else if (determinant == 0) {
            root1 = root2 = -b / (2 * a);
            System.out.format("%.2f;", root1);
        }
        else {
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-determinant) / (2 * a);
            System.out.format("%.2f+i%.2f", real, imaginary);
            System.out.format("\n%.2f-i%.2f", real, imaginary);
        }
    }
}
