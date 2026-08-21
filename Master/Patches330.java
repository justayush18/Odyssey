package Leetcode;

public class Patches330 {

    static int patches(int[] nums, int n) {
        int miss = 1;
        int i = 0;
        int m = nums.length;
        int p = 0;

        while (miss <= n) {
            if (i < m && nums[i] <= miss) {
                miss = miss + nums[i];
                i++;
            } else {
                miss = miss + miss;
                p++;
            }
        }
        return p;
    }

    public static void main(String[] args) {
        int[] arr = {1,3};
        System.out.println(patches(arr, 6));
    }
}
