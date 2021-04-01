package com.section2;

public class PrimeOrNot {

    static void check(int a) {
        int count = 0;
        if (a > 1) {
            for (int i = 1; i <= a; i++)
                if (a % i == 0)
                    count++;

                if (count == 2) {
                    System.out.println("Prime Number");
                }
                else
                {
                    System.out.println("Not Prime Number");
                }
            }
        else
            { System.out.println("Not Prime Number");
         }
        }

        public static void main(String[] args){
            check(3);
        }
}