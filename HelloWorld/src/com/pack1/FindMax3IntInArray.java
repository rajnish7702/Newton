package com.pack1;

import java.util.Scanner;

public class FindMax3IntInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        int max1=0;
        int max2=0;
        int max3=0;
        int max4=0;

        for(int i=0; i<size; i++){
            if(arr[i]>max1){
                max4=max3;
                max3=max2;
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2) {
                max4 = max3;
                max3 = max2;
                max2 = arr[i];
            }
            else if(arr[i]>max3){
                max4=max3;
                max3=arr[i];
            }else if(arr[i]>max4){
                max4=arr[i];
            }
        }

        System.out.print(max1+" "+max2+" "+max3+" "+max4);
    }
}
