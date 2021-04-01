package com.section2;

public class MethodOverloading {
    int n1, n2;
    double x, y;

    static int overloading(int n1, int n2){
        int min;
        if (n1 > n2){
            min = n2;
        }
        else
        {
            min = n1;
        }
        return min;
    }

    static double overloading(double n1, double n2){
        double min;

        if (n1 > n2){
            min = n2;
        }

        else
        {
           min = n1;
        }
            return min;
    }

    static double overloading(double n1, int n2){
        double min;

        if (n1 > n2){
            min = n2;
        }

        else
        {
            min = n1;
        }
        return min;
    }

    static double overloading(int n1, double n2){
        double min;

        if (n1 > n2){
            min = n2;
        }

        else
        {
            min = n1;
        }
        return min;
    }

    public static void main(String[] args){
        System.out.println(overloading(2,3));
        System.out.println(overloading(2.5,6));
        System.out.println(overloading(3.0,9.8));
        System.out.println(overloading(12,5.1));
    }
}
