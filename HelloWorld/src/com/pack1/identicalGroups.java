package com.pack1;
/*
Identical Groups
Easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Myra has x red colour balls and y blue colour balls. She wants to distribute these balls into identical groups without any balls left. What is the largest number of groups she can make?

Identical groups mean there are equal number of same coloured balls in each group.
Input
A single line containing two integers x and y.

Constraints:
1<=x, y<=10000000
Output
Return the largest number of groups that can be made.
Example
Sample Input
3 9

Sample Output
3

Explanation:-
1 red ball and 3 blue ball will be in each group.

Sample Input:
4 9

Sample Output:
1
 */
import java.util.Scanner;

public class identicalGroups {
    static int ncr(int n, int r)
    {
        int ans = 1;
        for (int i = 1; i <= r; i += 1)
        {
            ans *= (n - r + i);
            ans /= i;
        }
        return ans;
    }
    static int NoOfDistributions(int N, int R)
    {
        return ncr(N - 1, R - 1);
    }
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int R = input.nextInt();
        System.out.println(NoOfDistributions(N, R));
    }
}