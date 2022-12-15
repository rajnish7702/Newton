package com.pack1;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner inputTacker = new Scanner(System.in);
        int n=inputTacker.nextInt();
        for(int i=1; i<n;i++){
            if(checkPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean checkPrime(int n){
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%2==0){
                return false;
            }
        }
        return true;
    }
}
