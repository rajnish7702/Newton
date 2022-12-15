package com.pack1;
import java.util.Scanner;
public class leanerSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        int numberToBefound=6;
        boolean notFound=false;
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]==numberToBefound){
                System.out.println("Number to be found :"+i);
                notFound=true;
            }
        }
        if(!notFound){
            System.out.println("Number not found :");
        }
    }
}
