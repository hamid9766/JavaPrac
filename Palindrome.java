package com.section2;

public class Palindrome {
    static void number(int num){
        boolean isPalindrome =false;
        int org_num = num;
        System.out.println(num);

        int rev = 0;
        while(num!=0){

            rev = rev *10 + num%10;
            num /=10;
        }
        System.out.println(rev);

        if (org_num==rev){
            isPalindrome = true;
            System.out.println(isPalindrome);
        }
        else{
            System.out.println(isPalindrome);
            System.out.println("given number is not a palindrome number");
        }
    }


    public static void main(String[] args) {
        number(124521);
    }
}
