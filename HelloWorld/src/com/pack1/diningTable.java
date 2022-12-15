package com.pack1;

import java.util.Scanner;

public class diningTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int R = sc.nextInt();
        int r = sc.nextInt();
        double Rd = (2*3.141*R)/2;
        double rc = (2*3.141*r);
        if(Rd>=rc){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
