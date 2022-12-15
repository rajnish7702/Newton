package com.pack1;

import java.util.Scanner;

public class GCD {
    public static void main (String[] args) {
        Scanner inputTacker = new Scanner(System.in);
        long m = inputTacker.nextLong();
        long n = inputTacker.nextLong();
        System.out.println(gcd(m,n));
    }
    public static long gcd(long m, long n){
        if(m>n){
            if(m%n==0){
                return n;
            }
        }
        return gcd(n,m%n);
    }
}
