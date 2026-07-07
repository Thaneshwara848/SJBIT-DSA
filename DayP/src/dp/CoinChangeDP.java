package dp;
import java.util.Arrays;
public class CoinChangeDP {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};// Available coin denominations
        int amount = 11; // Target amount
        // dp[i] stores minimum coins required to make amount i
        int[] dp = new int[amount + 1];
        // Fill dp array with a large value
        // amount + 1 means impossible initially
        Arrays.fill(dp, amount + 1);
        // Base case: 0 coins required to make amount 0
        dp[0] = 0;
        // Calculate minimum coins for every amount from 1 to 11
        for (int i = 1; i <= amount; i++) {
            // Try every coin
            for (int coin : coins) {
                // If coin can be used for current amount
                if (i >= coin) {
                    // Either keep old answer or use this coin
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        // If answer is still greater than amount, it is not possible
        if (dp[amount] > amount) {
            System.out.println("Not possible");
        } else {
            System.out.println("Minimum coins = " + dp[amount]);
        }
    }
}