package Leetcode;

public class PalindromeNum09 {

    static boolean palindrome (int x){
        int temp = x;
        if (x < 0) return false;
        if (x == 0) return true;
        int reverse = 0;
        while (x != 0){
            int digi = x % 10;
            reverse = reverse * 10 + digi;
            x /= 10;
        }

        return temp == reverse;
    }

    public static void main(String[] args) {
        int x = 121;
        System.out.println(palindrome(x));
    }
}
