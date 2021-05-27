package DsaAlgo;

//If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.

public class ReverseInteger {
    public static int reverse(int x){
        boolean neg = false;
        if(x<0){
            neg = true;
            x *= -1;
        }
        long rev=0;

        while(x>0){
            rev = rev * 10 + x%10;
            x /=10;
        }

        if(rev>Integer.MAX_VALUE){
            return 0;
        }
        return neg ? (int) (-1 * rev) : (int)rev;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
    }
}
