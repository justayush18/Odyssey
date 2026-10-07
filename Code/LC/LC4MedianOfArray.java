import java.util.Arrays;
//this is not optimized approach 
public class LC4MedianOfArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, merged, 0, nums1.length);
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);
        Arrays.sort(merged);
        if (merged.length % 2 == 0) {
            return (double) (merged[merged.length / 2] + merged[(merged.length / 2) - 1]) / 2;
        } else {
            return merged[merged.length / 2];
        }
    }
}
