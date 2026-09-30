import java.lang.Math;

public class Buy_sell_stock {

    public static void main(String[] args) {

        int[] prices = { 8, 4, 2, 5, 6, 7 };

        System.out.println(maximumProfit(prices));
    }

    static int maximumProfit(int[] prices) {

        // Minimum buying price seen so far
        int mini = prices[0];

        // Maximum profit found so far
        int profit = 0;

        // Traverse the array only once
        for (int i = 0; i < prices.length; i++) {

            // Find the minimum price in array
            mini = Math.min(mini, prices[i]);

            // Profit = selling price - buying price
            int cost = prices[i] - mini;

            // Store the maximum profit
            profit = Math.max(profit, cost);
        }

        return profit;
    }
}
