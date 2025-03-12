package arrays;

public class ClimbingStairs {

    public static int climbingStairs(int n) {
        if (n == 0 || n == 1) return 1;

        return climbingStairs(n - 1) + climbingStairs(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(climbingStairs(3));
        System.out.println(climbingStairsDP(3));
        System.out.println(climbingStairsDP(5));
        System.out.println(climbingStairsDP(10));
    }

    public static int climbingStairsDP(int n) {
        if (n == 0 || n == 1) return 1;

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
