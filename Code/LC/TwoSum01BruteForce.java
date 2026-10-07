package Leetcode;

public class TwoSum01BruteForce {
    public int[] twoSum(int[] nums, int target) {
        int answer;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                answer = nums[i] + nums[j];
                if (answer == target)
                    return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        TwoSum01BruteForce ts = new TwoSum01BruteForce();
        int[] arr = {2, 7,11};
        int[] ans = ts.twoSum(arr, 9);
        System.out.println("[" + ans[0] + ", " + ans[1] + "]");
    }
}