package com.section2;

import java.util.Scanner;

public class AppleCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m1 = sc.nextInt();
        int p1 = sc.nextInt();
        int m2 = sc.nextInt();
        int p2 = sc.nextInt();

        int min_cost = -1;

        for(int i = 0; m1*i<=n; i++){

            int count2 = n- m1*i;
            if (count2%2 == 0){
                int cost = p1*i + p2*(count2/m2);
            }
        }
    }
}
