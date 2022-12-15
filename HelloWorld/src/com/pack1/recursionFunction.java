package com.pack1;

public class recursionFunction {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        int numberToBeFound = 9;

        //binarySearch(arr, numberToBeFound);
        int index = binarySearchUsingRecursion(arr, 0,  arr.length -1, numberToBeFound);
        System.out.println("Number found at index " + index);
    }

    public static int binarySearchUsingRecursion(int[] arr, int l, int h, int numberToBeFound){
        if(l > h){
            return -1;
        }

        int mid = l + (h-l)/2;

        if(arr[mid] == numberToBeFound){
            return mid;
        }

        if(arr[mid] > numberToBeFound){
            return binarySearchUsingRecursion(arr, l, mid -1, numberToBeFound);
        }else{
            return binarySearchUsingRecursion(arr, mid + 1, h, numberToBeFound);
        }
    }
    public static void binarySearch(int[] arr,int numberToBeFound){
        int l=0, h = arr.length -1;

        while(l <= h){
            int mid = l + (h-l)/2;

            if(arr[mid] == numberToBeFound){
                System.out.println("Found number at index " + mid);
                break;
            }

            if(arr[mid] > numberToBeFound){
                h = mid - 1;
            }else{
                l = mid + 1;
            }
            System.out.println("New value of l = " + l + " and h = " + h);

        }
    }

}