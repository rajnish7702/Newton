package com.pack3;
import java.util.Arrays;
public class rearrangeArray {
    public static void main(String[] args) {
        int arr[] = {-4, 8, 6, -5, 6, -2, 1, 2, 3, -11};
        int j,temp,n;
        n = arr.length;
        for (int i = 0; i <n; i++){
            j = i;
            while ((j > 0) && (arr[j] >0) && (arr[j-1] < 0)){
                temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
