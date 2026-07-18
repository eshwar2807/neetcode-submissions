class Solution {
    public int maxProfit(int[] prices) {
int minPrice = prices[0];      // cheapest price seen so far
    int maxProfit = 0;             // best profit so far

    for (int i = 1; i < prices.length; i++) {
        // could I sell today for a profit against the cheapest day behind me?
        maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        // is today a new cheapest day for future sells?
        minPrice = Math.min(minPrice, prices[i]);
    }
    return maxProfit;
    }
}
