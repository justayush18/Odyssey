package Leetcode;

public class DistanceCalculator1848 {

    int distance(int arr[], int target, int start) {
        int res = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                res = Math.min(res, Math.abs(i - start));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        DistanceCalculator1848 dc = new DistanceCalculator1848();
        int[] arr = {5,2,1,3,45,6,53,3,5,3,5};
        System.out.println(dc.distance(arr, 5, 3));
    }
}
