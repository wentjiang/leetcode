package com.wentjiang.leetcode.q701_800;

public class Question733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        boolean[][] haveFindImage = new boolean[image.length][image[0].length];
        changePointColor(image, sr, sc, newColor, haveFindImage);
        return image;
    }

    public void changePointColor(int[][] image, int sr, int sc, int newColor, boolean[][] haveFindImage) {
        haveFindImage[sr][sc] = true;
        int originColor = image[sr][sc];
        image[sr][sc] = newColor;
        if (sr - 1 >= 0 && image[sr - 1][sc] == originColor && !haveFindImage[sr - 1][sc]) {
            changePointColor(image, sr - 1, sc, newColor, haveFindImage);
        }
        if (sc - 1 >= 0 && image[sr][sc - 1] == originColor && !haveFindImage[sr][sc - 1]) {
            changePointColor(image, sr, sc - 1, newColor, haveFindImage);
        }
        if (sr + 1 < image.length && image[sr + 1][sc] == originColor && !haveFindImage[sr + 1][sc]) {
            changePointColor(image, sr + 1, sc, newColor, haveFindImage);
        }
        if (sc + 1 < image[0].length && image[sr][sc + 1] == originColor && !haveFindImage[sr][sc + 1]) {
            changePointColor(image, sr, sc + 1, newColor, haveFindImage);
        }
    }
}
