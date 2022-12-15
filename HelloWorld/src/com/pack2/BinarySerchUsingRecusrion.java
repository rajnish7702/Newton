/*
package com.pack2;



public class BinarySerchUsingRecusrion {
    public static void main(String[] args) {
        int arr[] ={5,9,1,3,4};
        int numberToBeFound=4;
        binarSearchUsingRecursion(arr,0,arr.length-1,numberToBeFound);
    }
    public static void binarSearchUsingRecursion(int arr[],int l,int h,int nuberToBeFound){
        if(l>h){
            System.out.println("Number not found");
            return;
        }
        int mid=l+(h-l)/2;
        if(arr[mid] == nuberToBeFound){
            System.out.println(l+" "+h);
            System.out.println("number to be found :"+mid);
            System.out.println(l+" "+h);
            return;
        }
        if(arr[mid]>nuberToBeFound){
            System.out.println(l+" "+h);
            binarSearchUsingRecursion(arr,l,mid-1,nuberToBeFound);
        }
        else {
            System.out.println(l+" "+h);
            binarSearchUsingRecursion(arr,mid+1,h,nuberToBeFound);
        }
    }
}
*/
