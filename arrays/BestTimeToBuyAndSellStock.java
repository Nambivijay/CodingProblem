/**
 * Problem: Best Time to Buy and Sell Stock
 * You are given an array prices where prices[i] is the price of a given stock
 * on the ith day. You want to maximize your profit by choosing a single day to
 * buy and a single day in the future to sell.
 * Return the maximum profit you can achieve.
 * 
 * Example:
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();

        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Input: [7,1,5,3,6,4]");
        System.out.println("Max Profit: " + solution.maxProfit(prices1));

        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("\nInput: [7,6,4,3,1]");
        System.out.println("Max Profit: " + solution.maxProfit(prices2));

        int[] prices3 = {2, 4, 1};
        System.out.println("\nInput: [2,4,1]");
        System.out.println("Max Profit: " + solution.maxProfit(prices3));
    }
}
