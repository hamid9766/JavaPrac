package com.section2;

import java.util.Arrays;

public class EqualityOfArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b[] = {1,2,3,4,5};

        /*
        boolean compare = Arrays.equals(a,b);
        if (compare==true){
            System.out.println("arrays are equal");
        }
        else
        {
            System.out.println("arrays are not equal");
        }
        */

        boolean status = false;

        if (a.length ==  b.length){
            for (int i =0; i<a.length; i++){
                if (a[i]!=b[i])
                    status = false;
            }
        }
        else {
            status = false;
        }

        if (status == true){
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }


    }
}
