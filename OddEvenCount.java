package com.section2;

public class OddEvenCount {
    static void count(int n){
        int even_count = 0;
        int odd_count = 0;


        while (n!=0){
           int rem = n%10;

            if(rem%2==0){
                even_count++;
            }
            else {
                odd_count++;
            }
            n/=10;
        }
        System.out.println("even number count = " + even_count + " odd number count = " + odd_count);
    }

    public static void main(String[] args) {
        count(12345);
    }
}
