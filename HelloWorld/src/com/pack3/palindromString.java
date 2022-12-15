package com.pack3;

import java.util.Locale;
import java.util.Scanner;

public class palindromString {
    public static void main(String[] args) {
       String str = "mom";
       str.toLowerCase();
       boolean a = isPalindrome(str);
       System.out.println(a);
    }
    public static boolean isPalindrome(String str){
        String rev="";
        boolean ans= false;
        for(int i=str.length()-1;i>=0;i--){
            rev = rev+str.charAt(i);
        }
        if(str.equals(rev)){
            ans=true;
        }
        return ans;
    }
}
