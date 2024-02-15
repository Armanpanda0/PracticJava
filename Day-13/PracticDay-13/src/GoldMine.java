public class GoldMine {
    public static int getMaxGold(int n, int m, int[][] M) {
        // Create a 2D table to store the maximum gold values
        int[][] dp = new int[n][m];

        // Fill the dp table starting from the last column
        for (int col = m - 1; col >= 0; col--) {
            for (int row = 0; row < n; row++) {
                // Initialize the current cell with the gold value
                int currentGold = M[row][col];

                // Consider moving diagonally up towards the right
                if (row > 0) {
                    currentGold += dp[row - 1][col + 1];
                }

                // Consider moving to the right
                if (col < m - 1) {
                    currentGold += dp[row][col + 1];
                }

                // Consider moving diagonally down towards the right
                if (row < n - 1) {
                    currentGold += dp[row + 1][col + 1];
                }

                // Update the dp table with the maximum gold value
                dp[row][col] = currentGold;
            }
        }

        // Find the maximum gold value in the first column
        int maxGold = 0;
        for (int row = 0; row < n-1; row++) {
            maxGold = Math.max(maxGold, dp[row][0]);
        }

        return maxGold;
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int[][] M = {
                {1, 3, 3},
                {2, 1, 4},
                {0, 6, 4}
        };

        int result = getMaxGold(n, m, M);
        System.out.println("Maximum amount of gold: " + result);
    }
}
