package com.pack1;

import java.awt.desktop.SystemSleepEvent;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class maxNumbers
{
    public static void main(String[] args) {
        Scanner inputTacker = new Scanner(System.in);
        int t = inputTacker.nextInt();
        for(int i=0;i<t;i++)
        {
            int n = inputTacker.nextInt();
            int[] arr = new int[n];
            for(int j=0;j<arr.length;j++){
                arr[j] = inputTacker.nextInt();
            }
            Arrays.sort(arr);
            System.out.print("");
            System.out.print(arr[n-1]+" ");
            System.out.println(" ");
            System.out.print(arr[n-2]+" ");
            System.out.println(" ");
            System.out.println(arr[n-3]+" ");
        }
    }
}
