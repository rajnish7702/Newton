package com.pack1;

import java.util.*;

/*
Removing duplicates from lists
Easy

hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a string, convert it to a list containing all of its elements only once without any repetition, even if there is repetition in the string.

hint - you might use sets for this.
Input
The input would be a string containing 5 characters. Each character can be any alpha numeric value.
Output
The output would be a sorted list with no repeating elements
Example
Sample input
abbbc

Sample output
['a', 'b', 'c']

Explanation-
the string 'abbbc' contains elements 'a','b', and 'c' , therefore they are printed out in the list without any duplication.
Generate Expected Output
Insert Input

 */
public class removingDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        char[] s = str.toCharArray();
        HashSet<Character> hash = new HashSet<>();
        for(int i = 0; i<str.length();i++){
            for(int j=0;j<str.length();j++){
                if(s[i]!=s[j]){
                    hash.add(s[i]);
                }
            }
        }
        System.out.print(hash);
    }
}
