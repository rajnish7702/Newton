package com.pack1;

import java.util.Scanner;

public class charInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            char[][] ch =  new char[n][m];
            String s2=sc.nextLine();
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    ch[i][j] = sc.next().charAt(0);
                }
            }
            char[] ch2={};
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                   if(i>=j){
                       ch2[i]=ch[i][j];
                   }
                }
            }
            if(ch2==s2.toCharArray()){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
            t--;
        }
    }
}
