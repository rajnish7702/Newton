package com.pack1;

import java.util.Scanner;

public class Min
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a  = in.nextInt();
        int arr[] = new int[a];
        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = in.nextInt();
        }
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
