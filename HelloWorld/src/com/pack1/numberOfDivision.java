package com.pack1;

import java.util.Scanner;

public class numberOfDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int count = 0;
            if(n%2==0){
                int i=1;
                while(i<n){
                    if(i%2==0){
                        count++;
                    }
                    i++;
                }
                System.out.println(count);
            }

            else {
                System.out.println(0);
            }
            t--;
        }
    }

}
