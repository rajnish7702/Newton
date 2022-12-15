package com.pack1;

import java.util.Scanner;

public class pairElement {
    public static void main(String[] args) {
        Scanner inputTacker = new Scanner(System.in);
        int n = inputTacker.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i< arr.length;i++) {
            arr[i] = inputTacker.nextInt();
        }
        int getMaxD = findMax(arr,n);
        System.out.println(getMaxD);
    }
    static int findMax(int[] arr, int n)
    {
        int max_d = -1;
        int i = arr[0];
        int j = arr[n-1];
        while (i < j) {
            if (arr[j] > arr[i] && max_d < (j - i)) {
                max_d = j - i;
            }
            //j--;
            i++;
        }
        return max_d;

    }
}
