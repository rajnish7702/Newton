package com.pack1;

public class Main {

    public static void main(String[] args){

        //intializing a String
        String myName = "Shubham";

        //finding it's length
        System.out.println("length " + myName.length());

        //get a char at an index
        System.out.println("get char " + myName.charAt(3));

        //get a substring
        System.out.println("get substring from index 3 " + myName.substring(3));

        //get a inside substring
        System.out.println("get substring from index 3 to 5 " + myName.substring(3, 5));

        String sirName = " Bhasin ";

        //concat apart from +
        System.out.println("concat " + myName.concat(sirName));


        //gives you the index of a substring
        System.out.println("indexOf " + myName.indexOf("Sh"));  //returns index of first occurrance of b

        //to upper case
        System.out.println("upper case " + myName.toUpperCase());

        //to lower case
        System.out.println("upper case " + myName.toLowerCase());


        //trim
        System.out.println("trimming , before " + sirName + " after " + sirName.trim());

        //replace
        System.out.println("replace " + myName.replace("hu","cd"));
        System.out.println("after replace " + myName);


        String myName2 = "shubham";
        //equate
        System.out.println("check equate, " + myName.equals(myName2));

        System.out.println("check equate case insensitive, " + myName.equalsIgnoreCase(myName2));


        //string compare
        String anotherString = "Shubham";
        String anotherString2 = "zhubham";
        System.out.println("compare " + anotherString.compareToIgnoreCase(anotherString2));
        //compare gives you a diff between anotherString - anotherString2



    }

}