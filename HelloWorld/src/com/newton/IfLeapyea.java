package com.newton;
import java.util.*;
/*
If- Leap year
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a year, find if it is a leap year. Leap year is the year that is multiple of 4. But, multiples of 100 which are not multiples of 400 are not leap years.
Input
The input contains a single integer N

Constraint:
1 <= n <= 5000
Output
Print "YES" if the year is a leap year else print "NO".
Example
Sample Input:
2000

Sample Output:
YES

Sample Input:
2003

Sample Output:
NO

Sample Input:
1900

Sample Output:
NO
 */
public class IfLeapyea {
    public static void main (String[] args)
    {
        Scanner inputTaker=new Scanner(System.in);
        int year=inputTaker.nextInt();
        if((year%4==0 && year%100!=0 )||(year%400==0))
        {
            if(year%100==0 && year%400!=0)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
            }
        }
        else{
            System.out.println("NO");
        }
    }
}
