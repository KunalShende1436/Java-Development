package Array;

public class BuyAndSellStocks_DSAQues {
    public static int maxProfit(int[] prices)
    {
        int maxProfit=0;
        int BuyPrice=Integer.MAX_VALUE;

        for(int i=0;i<prices.length;i++)
        {
            if(BuyPrice < prices[i])// If the current price is greater than the BuyPrice, we can calculate profit
            {
                int profit=prices[i]-BuyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else // If the current price is less than the BuyPrice, we update the BuyPrice
            {
                BuyPrice=prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        int maxProfit=maxProfit(prices);
        System.out.println("Maximum Profit is: " + maxProfit);
    }

}
