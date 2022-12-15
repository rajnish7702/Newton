package com.pack1;

public class QuickSoret {
    public static void main(String[] args) {
        int arr[] = {8,4,7,1,9,2,0,3,6,5};
        quickSort(arr,0, arr.length - 1);
        // printing sorteda array;
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void quickSort(int[] arr,int low, int high){
        if(low < high){
            int pivot = partition(arr,low,high);
            System.out.println("Pivot is at index "+pivot);
            quickSort(arr,low,pivot - 1);
            quickSort(arr,pivot + 1,high);
        }
    }
    public static int partition(int[] arr, int low,int high){
        int pivot=arr[high];
        System.out.println("Select "+pivot+" as pivot");
        int i = low;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                // swap small number to left side
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
        // swap pivot to correct position
        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        return i;
    }
}