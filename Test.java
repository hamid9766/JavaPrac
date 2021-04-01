package com.section2;

public class Test {
    static int addtion(int n){
        int sum =0;
        int temp = n;

        while(temp>0){
            int lastDigit = temp%10;
            //temp/=10;
            sum  += (lastDigit*10) + (temp/10);
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(addtion(234));

    }
}
