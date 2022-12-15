package com.pack2;

public class recursionUsingfun {
    public static void main(String[] args) {
       // printUsining(5);
        //System.out.println(printFcatoricalUsingRRecursion(10));
        int arr[]={1,2,3,4,5,6};
        int numberToBeFound=5;
        int index=binarySerchUsingRecursion(arr,0,arr.length-1,numberToBeFound);
        System.out.println(index);
    }
    public static int binarySerchUsingRecursion(int[] arr,int l ,int h, int numberToBeFound){
        if(l > h){
            return -1;
        }
        int mid=l+(h-l)/2;
        if(arr[mid]==numberToBeFound){
            return mid;
        }
        if(arr[mid]>numberToBeFound){
            return binarySerchUsingRecursion(arr,l,mid-1,numberToBeFound);
        }
        else {
            return binarySerchUsingRecursion(arr,mid+1,h,numberToBeFound);
        }
    }
    public static void printUsining(int x){
        if(x==-1){
           return;
        }
        System.out.println(x);
        printUsining(x-1);
    }
    public static int printFcatoricalUsingRRecursion(int x){
        System.out.println("need to find factorial of "+ x);
        if(x==1){
            return 1;
        }
        System.out.println("nedd to find factoriacl of "+(x-1)+" to cal foctorial of "+x);
        int factLowerNumber = printFcatoricalUsingRRecursion(x-1);
        System.out.println("fcatorial of "+(x-1)+" is "+ factLowerNumber+" now we can calculate fact of "+x);
        return x*factLowerNumber;
    }

}
