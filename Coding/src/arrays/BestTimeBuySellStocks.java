package arrays;

public class BestTimeBuySellStocks {

    /*
     You want to maximize your profit by choosing a single day to buy one stock
     and choosing a different day in the future to sell that stock.
     */

    public static int maxProfit(int[] prices) {

        if (prices == null || prices.length <= 1) return 0;

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(prices));
        System.out.println(maxProfit(prices2));
    }
}

