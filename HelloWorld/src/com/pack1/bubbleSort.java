package com.pack1;
import java.util.Scanner;
public class bubbleSort {
    public static void main (String[] args) {
        // Your code here
        Scanner inputTaker = new Scanner(System.in);
        int n = inputTaker.nextInt();

        int[] arr = new int[n];

        for(int i =0;i<n; i++){
            arr[i] = inputTaker.nextInt();
        }


        //bubble sort
        for(int i =0;i<n-1; i++){

            for(int j =0;j<n-1; j++){


                if(arr[j] < arr[j+1]){
                    //swap lower value to greater index
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }


        for(int i =0;i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
