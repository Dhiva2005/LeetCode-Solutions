// Problem 121: Best Time to Buy and Sell Stock

class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int temp = 0;
        int num = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < num) {
                num = prices[i];
            }
            temp = prices[i] - num;
            if (ans < temp)
                ans = temp;
        }
        return ans;
    }
}