package com.pack3;

public class HeapSort {
    public static void main(String[] args) {
        int arr[] = {1, 7, 3, 4};
        int n = arr.length;
        sort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sort(int arr[]){
        int n=arr.length;
        for(int i=n/2-1;i>=0;i--){
            subpart(arr,n,i);
        }
        for(int i=n-1;i>0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            subpart(arr,i,0);
        }
    }
    public static void subpart(int[] arr, int n,int i){
        int largest=i;
        int l=2*i+1;
        int r=2*i+2;
        if(l<n && arr[l]>arr[largest]){
            largest=l;
        }
        if(r<n && arr[r]>arr[largest]){
            largest = r;
        }
        if(largest!=i){
            int swap= arr[i];
            arr[i]=arr[largest];
            arr[largest]=swap;
            subpart(arr,n,largest);
        }
    }
}
