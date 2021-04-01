package com.section2;

public class Fibonacci {

    static void series(int n){
        int n1 = 0; int n2 = 1, sum =0 ;
        System.out.print(n1 + " " + n2);
        for (int i = 2; i<=n; i++){
            sum = n1+n2;
            System.out.print(" " + sum);

            n1 = n2;
            n2 = sum;
        }

    }
    public static void main(String[] args){
        series(9);
    }
}
