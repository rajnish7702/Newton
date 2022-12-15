package com.pack1;

public class Maxt
{
    public static void main(String[] args) {
        int[] arr=new int[10];
        System.out.println("array default values = "+arr[0]);
        arr[0]=10;
        System.out.println("array fist index values = "+arr[0]);
        arr[1] = 25;
        System.out.println("array second values = "+arr[1]);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
