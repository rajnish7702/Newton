package com.pack1;
import java.util.Scanner;
public class SelectionSorts {
    public static void main(String[] args){
        Scanner inputTaker = new Scanner(System.in);
        int n = inputTaker.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ;i < n;i++){
            arr[i] = inputTaker.nextInt();
        }
        performSelectionSort(arr,n);
    }

    private static void performSelectionSort(int[] arr, int n){

        for(int i = 0;i< n-1;i++){

            int min_index = i;
            for(int j = i + 1;j<n; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }

            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }

        //print of array
        for(int i = 0;i < n;i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void performMergeSort(int[] arr, int n){
        mergeSort(arr, 0, n-1);
        for(int i = 0;i < n;i++){
            System.out.print(arr[i] + " ");
        }
    }


    private static void mergeSort(int[] arr, int l, int h){
        if(l<h){

            int mid = l + (h-l)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, h);
            merge(arr, l, mid, h);
        }

    }

    private static void merge(int[] arr, int l, int mid, int h){
        int n1 = mid - l + 1;
        int n2 = h - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for(int i =0;i<n1;i++){
            leftArray[i] = arr[l + i];
        }

        for(int i =0;i<n2;i++){
            rightArray[i] = arr[mid + 1 + i];
        }

        int i =0,j=0;
        int k =l;
        while( i < n1 && j < n2){
            if(leftArray[i] < rightArray[j]){
                arr[k] = leftArray[i];
                i++;
            }else{
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while(i < n1){
            arr[k] = leftArray[i];
            k++;
            i++;
        }

        while(j < n2){
            arr[k] = rightArray[j];
            k++;
            j++;
        }
    }
}
