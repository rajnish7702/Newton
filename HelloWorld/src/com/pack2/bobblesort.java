package com.pack2;

public class bobblesort {
    public static void main(String[] args) {
        int[] a={4,1,2,3};
        int temp;
        for(int i=0;i<=a.length-1;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println(a.length);
    }
}
