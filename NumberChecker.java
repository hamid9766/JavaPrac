package com.section2;

public class NumberChecker {
    static void checker(int n){
        int i, m=0,flag = 0;
        m = n/2;

        if( n == 0 || n == 1 ){
            System.out.println(n + " is not a prime number");
        }

        else {
            for(i =2; i<=m; i++)
            {
                if(n % 2 == 0){
                    System.out.println(n+ " is not a prime number");
                    flag = 1;
                    break;
                }
            }

            if (flag==0)
            {
                System.out.println( n + " is a prime number");
            }

            }
        }

    public static void main(String[] args) {
        checker(0);
        checker(1);
        checker(3);
        checker(8);
        checker(19);
    }
}
