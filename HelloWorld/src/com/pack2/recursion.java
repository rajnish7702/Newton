/*
package com.pack2;

public class recursion {
    public static void main(String[] args) {
        //System.out.println(printFactorial(5));
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        int numberToBeFound = 9;
        binarySearchUsingRecursion(arr,0,arr.length-1,numberToBeFound);
    }
    public static int printFactorial(int x) {
        if (x == 1) {
            return 1;
        }
        return x * printFactorial(x - 1);
    }
    public static void binarySearchUsingRecursion(int[] arr,int l, int h,int numberToBeFound)
    {
        int mid=l+(h-l)/2;
        if(arr[mid]==numberToBeFound){
            System.out.println(mid);
        }
        if(arr[mid]>numberToBeFound){
            binarySearchUsingRecursion(arr,l,mid+1,numberToBeFound);
        }
        else {
            binarySearchUsingRecursion(arr,mid-1,h,numberToBeFound);
        }
    }
}
*/
