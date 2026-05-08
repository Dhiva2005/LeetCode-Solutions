// Problem 322: Coin Change

class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            dp[i] = amount + 1;
        }
        dp[0] = 0;
        for (int num : coins) {
            for (int i = num; i <= amount; i++) {
                dp[i] = Math.min(dp[i], dp[i - num] + 1);
            }
        }
        if (dp[amount] > amount) {
            return -1;
        } else {
            return dp[amount];
        }
    }
}