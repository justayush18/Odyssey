package Leetcode;

public class GraphFloodFill733 {
    public void helper(int[][] image, int sr, int sc, int color, boolean[][] vis, int originalColor){
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != originalColor ||  vis[sr][sc]){
            return;
        }
        vis[sr][sc] = true;
        image[sr][sc] = color;
        // left
        helper(image, sr, sc-1, color, vis, originalColor);
        //right
        helper(image, sr, sc+1, color, vis, originalColor);
        //up
        helper(image, sr-1, sc, color, vis, originalColor);
        // down
        helper(image, sr+1, sc, color, vis, originalColor);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) return image;
        boolean[][] vis = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }
    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 1},
                {1, 2, 0},
                {1, 0, 1}
        };
        int sr = 1;
        int sc = 1;
        GraphFloodFill733 flood = new GraphFloodFill733();
        flood.floodFill(image, sr, sc, 2);
        for (int i = 0; i < image.length; i++){
            for (int j = 0; j < image[0].length; j++){
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }

    }
}
