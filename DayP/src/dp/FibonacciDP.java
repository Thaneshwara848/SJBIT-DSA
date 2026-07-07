package dp;

public class FibonacciDP {
    public static void main(String[] args) {
        int n = 6;
        int[] dp = new int[n + 1];
        dp[0] = 0;   // Base case
        dp[1] = 1;   // Base case
        for (int i = 2; i <= n; i++) {
            // Current value = previous two values
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.println("Fibonacci = " + dp[n]);
    }
}