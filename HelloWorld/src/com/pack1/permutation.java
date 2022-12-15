package com.pack1;

public class permutation {
    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 3, 4, 5 };
        int first = arr[0];
        int start = 0;

        // swaping each element with the first
        // element
        for (int i = 1; i < arr.length; i++) {
            arr[start++] = arr[i];
            arr[i] = first;
        }
        // Printing the element in the
        // array.......
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
