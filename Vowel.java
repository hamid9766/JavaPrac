package com.section2;

public class Vowel {
    static boolean stringContainsVowel(String s){
        return s.toLowerCase().matches(".*[aeiou].*");
    }
    public static void main(String[] args){
        System.out.println(stringContainsVowel("hello"));
        System.out.println(stringContainsVowel("mango"));
        System.out.println(stringContainsVowel("dg"));
    }
}
