package com.pack1;

import java.sql.PseudoColumnUsage;
import java.util.Scanner;

public class Donation
{
    public static void main (String[] args) {
        Scanner inputTacker = new Scanner(System.in);
        int n = inputTacker.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = inputTacker.nextInt();
        }
        long totalDonation = getTotalDonation(arr);
        System.out.println(totalDonation);
    }
    static long getTotalDonation(int[] arr)
    {
        int currentDonation = 0;
        long totalDonation = 0;
        for(int i=0;i<arr.length;i++)
        {
            currentDonation = Math.max(currentDonation,arr[i]);
            totalDonation = totalDonation+currentDonation;
            System.out.print(currentDonation-arr[i]+" ");
        }
        System.out.println(" ");
        return totalDonation;
    }
}
