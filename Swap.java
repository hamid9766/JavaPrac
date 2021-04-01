package com.section2;

public class Swap {

    static void swaping(int a , int b){

        System.out.println("Before Swapping a = " + a + " and b = " + b);
        /*int t = a;
        a = b;
        b = t;*/

        //Logic 2 by using + an - operator
        a = a+b;
        b= a-b;
        a =a-b;

        System.out.println("After Swapping a = " + a + " and b = " + b);
    }

    public static void main(String[] args){
        //reverse number by using string buffer class
        int num = 1234;

        StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev= sb.reverse();

        //this is reversed string program
        System.out.println("reversed String "  + rev);
        swaping(9,20);


    }
}
