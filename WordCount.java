package com.section2;

public class WordCount {
    static void count(String s){
        int size =0;
        char[] c = s.toCharArray();
        for(int i =0; i<c.length; i++){
            size++;
        }
        System.out.println("Word count in " + s + " = " + size);
        }

    public static void main(String[] args) {
        count("Happy");
        count("id");
        count("i");
    }
    }

