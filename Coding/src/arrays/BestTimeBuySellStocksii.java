package arrays;

public class BestTimeBuySellStocksii {

    /*
    On each day, you may decide to buy and/or sell the stock.
    You can only hold at most one share of the stock at any time.
    However, you can buy it then immediately sell it on the same day.
     */

    public static int maxProfit(int[] prices) {

        if (prices == null || prices.length <= 1) return 0;

        int maxProfit = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i]) {
                maxProfit += prices[i + 1] - prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {1, 2, 3, 4, 5};
        int[] prices3 = {7, 6, 4, 3, 1};
        int[] nullPrice = {};
        int[] onePrice = {2};
        System.out.println(maxProfit(prices));
        System.out.println(maxProfit(prices2));
        System.out.println(maxProfit(prices3));
        System.out.println(maxProfit(nullPrice));
        System.out.println(maxProfit(onePrice));
    }
}
