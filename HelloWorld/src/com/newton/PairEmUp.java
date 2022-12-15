package com.newton;
import java.util.*;

/*
Pair Em Up (Contest)
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of N elements where N is even. You have to pair up the elements into N/2 pairs such that each element is in exactly 1 pair. You need to find minimum possible X such that there exists a way to pair the N elements and for no pair sum of its elements is greater than X.
Input
First line contains N.
Second line contains N space separated integers, denoting array.

Constraints:
1 <= N <= 100000
1 <= elements of the array <= 1000000000
Output
Print a single integer, minimum possible X.
Example
Sample Input
4
3 1 1 4

Sample Output
5

Explanation: we can pair (1, 3) and (1, 4) so all pairs have sum less than or equal to 5.
 */
public class PairEmUp {
    public static void main (String[] args) {
        Scanner inputTacker = new Scanner(System.in);
        int n = inputTacker.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = inputTacker.nextInt();
        }
        Arrays.sort(arr);
        int maxi = -1;
        for(int i=0;i<n;i++){
            int cur=arr[i] + arr[n-i-1];
            if(maxi<cur){
                maxi=cur;
            }
        }
        System.out.println(maxi);
    }
}
