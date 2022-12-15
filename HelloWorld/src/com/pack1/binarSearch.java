package com.pack1;

public class binarSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int numberToBeFound = 11;

        int l = 0, h = arr.length - 1;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (arr[mid] == numberToBeFound) {
                System.out.println("Found number at index " + mid);
                break;
            }

            if (arr[mid] > numberToBeFound) {
                h = mid - 1;
            }
            else {

                l = mid + 1;
            }
            System.out.println("New value of l = " + l + " and h = " + h);
        }

    }
}
