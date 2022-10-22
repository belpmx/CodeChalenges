package Leetcode;
/**
 *<a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/solutions/127440/best-time-to-buy-and-sell-stock/">...</a>
 *
 * You are given an array prices where prices[i] is the price of a given stock on the ith day. *
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. *
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * */

public class BuyAndSellStock{
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;

        for (int index = 0 ; index < prices.length; index++){
            if (prices[index]<min ) {
                //set min value
                min = prices[index];
            } else if (prices[index] - min > profit){
                //calculate max profit
                profit = prices[index]- min;
            }
        }
        return profit;
    }
}

