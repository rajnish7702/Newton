package com.pack3;

public class Mock {
    public static void main(String[] args){
        int[] arr = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
        int n=arr.length-1;
        sort(arr,0, n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sort(int []arr, int l, int h){
        if(l<h){
            int m = l+(h-l)/2;
            sort(arr,l,m);
            sort(arr,m+1,h);
            merge(arr,l,m,h);
        }
        return;
    }
    public static void merge(int[] arr, int l, int m, int h){
        int n1=m-l+1;
        int n2=h-m;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for(int i =0;i<n1;i++){
            left[i]=arr[l+i];
        }
        for(int i=0;i<n2;i++){
            right[i]=arr[m+1+i];
        }
        int i=0;
        int j=0;
        int k=l;
        while (i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k]=left[i++];
            }
            else {
                arr[k]=right[j++];
            }
            k++;
        }
        while (i<n1){
            arr[k++]=left[i++];
        }
        while (j<n2){
            arr[k++]=right[j++];
        }
    }

}
