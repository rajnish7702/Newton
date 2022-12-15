package com.pack1;

public class recursion {
    public static void main(String[] args){
        //printReverse(10);
        //printReverseUsingRecursion(10);

        System.out.println(printFactorial(5));
        System.out.println(printFactorialUsingRecursion(5));
    }

    public static void printReverse(int x){
        for(int i =x;i>=0;i--){
            System.out.println(i);
        }
    }

    public static void printReverseUsingRecursion(int x){
        if(x == 0){
            return;
        }
        System.out.println(x);
        printReverseUsingRecursion(x-1);
    }

    public static int printFactorial(int x){
        int factorial = 1;
        for(int i =x;i>=1;i--){
            factorial *= i;
        }
        return factorial;
    }

    public static int printFactorialUsingRecursion(int x){
        if(x == 1){
            return 1;
        }
        return x * printFactorialUsingRecursion(x-1);
    }

}
