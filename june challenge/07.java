// Coin Change 2

class Solution {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int val : coins) {
            for (int i = val; i <= amount; i++)
                dp[i] += dp[i - val];
        }
        return dp[amount];
    }
}