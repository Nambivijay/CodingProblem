import java.util.Arrays;
/**
 * Problem: Coin Change
 * Fewest coins to make up the amount. Return -1 if impossible.
 * Time: O(amount * n), Space: O(amount)
 */
public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++)
            for (int coin : coins)
                if (coin <= i) dp[i] = Math.min(dp[i], dp[i - coin] + 1);
        return dp[amount] > amount ? -1 : dp[amount];
    }
    public static void main(String[] args) {
        CoinChange sol = new CoinChange();
        System.out.println(sol.coinChange(new int[]{1,5,10,25}, 30)); // 2
        System.out.println(sol.coinChange(new int[]{2}, 3)); // -1
    }
}