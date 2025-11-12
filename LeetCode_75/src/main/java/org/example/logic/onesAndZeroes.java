package org.example.logic;

public class onesAndZeroes {

    public static int findMaxForm(String[] strs, int m, int n) {
        // dp[i][j] = max number of strings using at most i zeros and j ones
        int[][] dp = new int[m + 1][n + 1];

        for (String s : strs) {
            int[] count = count01(s);
            int zeros = count[0];
            int ones = count[1];

            // traverse capacities backwards to ensure 0/1 usage
            for (int i = m; i >= zeros; i--) {
                for (int j = n; j >= ones; j--) {
                    dp[i][j] = Math.max(dp[i][j], 1 + dp[i - zeros][j - ones]);
                }
            }
        }

        return dp[m][n];
    }

    private static int[] count01(String s) {
        int zeros = 0, ones = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') zeros++;
            else if (c == '1') ones++;
        }
        return new int[]{zeros, ones};
    }
}
