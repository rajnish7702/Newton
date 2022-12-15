package com.newton;

import java.util.Scanner;
/*
MCQ Exam
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Sara has an MCQ exam containing 100 questions this sunday but she isn't prepared. She came to know that in her exam
- >P number of Questions will have A as the correct option
- >Q number of Questions will have B as the correct option
- >R number of Questions will have C as the correct option
- >S number of Questions will have D as the correct option
Sara doesn't know the order of the questions. If Sara filled the MCQs optimally using the above information what will be the maximum of minimum marks she can get.
Input
The input contains 4 integers P, Q, R, and S.

Constraints:-
0 <= P, Q, R, S <= 100

Note:- P + Q + R + S will always be 100
Output
Print the maximum marks Sara can get.
Example
Sample Input:-
8 10 20 62

Sample Output:-
62
 */
public class MCQExam {
    public static void main (String[] args)
    {
        Scanner inputTacker=new Scanner(System.in);
        int p=inputTacker.nextInt();
        int q=inputTacker.nextInt();
        int r=inputTacker.nextInt();
        int s=inputTacker.nextInt();
        if((p+q+r+s)==100)
        {
            if(p>=q && p>=r && p>=s)
            {
                System.out.print(p);
            }
            else if(q>=p && q>=r && q>=s)
            {
                System.out.println(q);
            }
            else if(r>=p && r>=q && r>=s)
            {
                System.out.println(r);
            }
            else
            {
                System.out.println(s);
            }
        }
        else
        {
            System.out.println();
        }
    }
}
