package com.pack3;

import java.util.Scanner;

public class SortMergeArray {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int[] arr1 = new int[a];
        int[] arr2 = new int[b];

        int[] arr3=new int[a+b];
        for(int i=0;i<a;i++){
            arr1[i] = input.nextInt();
        }
        for(int j=0;j<b;j++){
            arr2[j] = input.nextInt();
        }
        mergeArrays(arr1,arr2,a,b,arr3);

    }
    public static void mergeArrays(int[] arr1, int[] arr2, int n1,int n2, int[] arr3)
    {
        int i = 0, j = 0, k = 0;
        while (i<n1 && j <n2)
        {
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }

        // Store remaining elements of first array
        while (i < n1)
            arr3[k++] = arr1[i++];

        // Store remaining elements of second array
        while (j < n2)
            arr3[k++] = arr2[j++];
    }
}
