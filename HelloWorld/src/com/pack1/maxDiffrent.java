package com.pack1;
import java.util.Scanner;
public class maxDiffrent {
    public static void main (String[] args) {
        Scanner inputTacker = new Scanner(System.in);
        int n = inputTacker.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length;i++){
            arr[i] = inputTacker.nextInt();
        }
        int getMax = printMadDif(arr, n);
        System.out.println(getMax);
    }
    static int printMadDif(int[] arr, int n){
        int max_d=-1;
        for(int i = 0;i<arr.length;i++)
        {
            for(int j=n-1;j>i;j--){
                if(arr[j]>arr[i] && max_d<(j-i)){
                    max_d = j-i;
                }
            }
        }
        return max_d;
    }
}
