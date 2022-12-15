package com.newton;
import java.util.Scanner;

/*
Steps Execution
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Take 4 digit number input from the user, add 8 to it and then divide it by 3(Only take integer part) Now, the modulus of that number is taken with 5 and then multiply the resultant value by 5. Display the final result.
Input
First line contains 4 digit number

Constraints
1000 <= number <= 9999
Output
Print the final result
Example
Sample Input :
2345

Sample Output :
20
 */
public class StepsExecution {
    public static void main (String[] args)
    {
        Scanner inputTacker = new Scanner(System.in);
        int x=inputTacker.nextInt();
        System.out.println((((x+8)/3)%5)*5);
    }
}
