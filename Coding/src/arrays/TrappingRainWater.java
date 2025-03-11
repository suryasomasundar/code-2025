package arrays;

public class TrappingRainWater {

    public static int maxWater(int[] heights) {

        int n = heights.length;
        int[] leftMax = new int[n];
        leftMax[0] = heights[0];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], heights[i]);
        }

        int[] rightMax = new int[n];
        rightMax[n - 1] = heights[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], heights[i]);
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            max += Math.min(leftMax[i], rightMax[i]) - heights[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] heights2 = {4, 2, 0, 3, 2, 5};
        System.out.println(maxWater(heights));
        System.out.println(maxWater(heights2));
    }
}
