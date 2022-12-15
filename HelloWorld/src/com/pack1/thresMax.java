package com.pack1;
import java.util.Scanner;
public class thresMax {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int size=sc.nextInt();
            int[] arr=new int[size];
            for(int i=0; i<size; i++){
                arr[i]=sc.nextInt();
            }
            int max1,max2,max3;
            max3=max2=max1=Integer.MIN_VALUE;
            for(int i=0;i<size;i++){
                if(arr[i]>max1){
                    max3=max2;
                    max2=max1;
                    max1=arr[i];
                } else if (arr[i]>max2) {
                    max3=max2;
                    max2=arr[i];
                } else if (arr[i]>max3) {
                    max3=arr[i];
                }
            }
            System.out.println(max1+" "+max2+" "+max3);
            t--;
        }

    }
}
