package com.section2;

import java.util.Scanner;

public class PalindromeString {

    static void stringChecker(String s){
        s = s.toLowerCase();
        String org_String = s;

        String rev = "";
        int length = s.length();

        for (int i = length-1; i>=0; i--){
            rev = rev + s.charAt(i);
        }
        if (rev.equals(s)){
            System.out.println("palindrom string");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        stringChecker(s);
    }
}
