package dp;
public class KnapsackDP { //We need maximum profit without crossing capacity 7.
    public static void main(String[] args) {
        int[] weight = {1, 3, 4, 5};
        int[] value = {1, 4, 5, 7};
        int capacity = 7;
        int n = weight.length;
        // dp[i][w] stores maximum profit using first i items with capacity w
        int[][] dp = new int[n + 1][capacity + 1];
        // Loop through all items
        for (int i = 1; i <= n; i++) {
            // Loop through all capacities from 1 to 7
            for (int w = 1; w <= capacity; w++) {
                // Current item weight is weight[i - 1]
                if (weight[i - 1] <= w) {
                    // Option 1: include current item
                    int include = value[i - 1] + dp[i - 1][w - weight[i - 1]];
                  // Option 2: exclude current item
                    int exclude = dp[i - 1][w];
                    // Take maximum profit
                    dp[i][w] = Math.max(include, exclude);
                } else {
                    // If item weight is more than capacity, cannot include
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }
        System.out.println("Maximum profit = " + dp[n][capacity]);
    }
}