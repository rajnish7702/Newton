package com.pack1;
import java.util.Scanner;
public class insertionSorts {
        public static void main (String[] args) {
            // Your code here
            Scanner daskdjfk = new Scanner(System.in);
            int t = daskdjfk.nextInt();
            while(t > 0){
                int n = daskdjfk.nextInt();
                int[] arr = new int[n];

                for(int i = 0;i<n;i++){
                    arr[i] = daskdjfk.nextInt();
                }
                performInsertionSort(arr, n);
                for(int i = 0;i<n;i++){
                    System.out.print(arr[i] + " ");
                }
                System.out.println("");
                t--;
            }
        }

    public static void performInsertionSort(int[] arr, int n){

        for(int i=1; i < n; i++){
            int keyToBeShifted = arr[i];
            int j = i -1;   // j=i-1=> 1-1=0

            while( j>=0 && arr[j] > keyToBeShifted){ // 0>=0  arr[0]> keyToBeshifted(arr[i]) =>

                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = keyToBeShifted;
        }
    }
}
