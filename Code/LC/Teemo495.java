package Leetcode;

public class Teemo495 {

    static int poisonedHer(int[] arr, int d) {
        int total = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            total += Math.min(d, arr[i + 1] - arr[i]);
        }
        return total + d;
    }

    public static void main(String[] args) {
        int[] time = {1, 4};
        int duration = 2;
        System.out.println(poisonedHer(time, duration));
    }
}
