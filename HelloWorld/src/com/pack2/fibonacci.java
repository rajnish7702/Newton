package com.pack2;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println(findNthFibonaaci(7));
    }
    public static int findNthFibonaaci(int x){
        if(x==1){
            return 0;
        }
        if(x==2){
            return 1;
        }
        return findNthFibonaaci(x-1) + findNthFibonaaci(x-2);
    }
}
