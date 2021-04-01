package com.section2;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt(100);
        System.out.println(a);

        double b = random.nextDouble();
        System.out.println(b);
    }
}
