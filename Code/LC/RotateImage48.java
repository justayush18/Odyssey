package Leetcode;

public class RotateImage48 {

    static void rotate(int[][] matrix) {
        int len = matrix.length;

        // traverse and swap without touching diagonal
        // (0,1) â†” (1,0) â†’ 2 â†” 4
        // (0,2) â†” (2,0) â†’ 3 â†” 7
        // (1,2) â†” (2,1) â†’ 6 â†” 8
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

//        1 4 7
//        2 5 8
//        3 6 9
        // reverse

        for (int i = 0; i < len; i++) {
            int left = 0;
            int right = len - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(mat);
//       1 2 3
//       4 5 6
//       7 8 9
    }
}
