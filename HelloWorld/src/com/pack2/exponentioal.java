package com.pack2;

public class exponentioal {
    public static void main(String[] args){
        int ans = power(2 , 5 ,5);
        System.out.println(ans);
    }
    public static int power(int x,int y,int p){
        int result = 1;
        x = x%p; // if x is grater then p already
        if(x==0)
        {
            return 0;
        }
        while (y>0){
            if(y%2==1){
                result =(result*x)%p;
            }
            x = (x*x)%p;
            y=y/2;
        }
        return result;
    }
}
