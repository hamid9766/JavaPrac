package com.section2;

public class MaximumValue {
    public static void main(String[] args) {
        int a[] = {2,9,45,13,-1,7,98};
        int max = a[0];
        int min = a[a.length-1];

        for (int i =0; i<a.length; i++){
            if(a[i]>max)
                max =a[i];
        }

        for (int i = 0; i< a.length; i++){
            if (a[i]<min)
                min =a[i];
        }
        System.out.println(max);
        System.out.println(min);
    }
}
