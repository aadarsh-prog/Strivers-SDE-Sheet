class Solution {
    public int maxProfit(int[] prices) {
        int purchase=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++)
        {
            profit=Math.max(profit,prices[i]-purchase);
            purchase=Math.min(purchase,prices[i]);
        }
        return profit;
        
    }
}

/*
APPROACH (Best Time to Buy and Sell Stock – Single Transaction):

1. Initialize:
   - purchase → minimum stock price seen so far (buying price)
   - profit   → maximum profit achievable

2. Traverse the prices array from day 1 onward:
   a) Calculate profit if selling on current day:
      prices[i] - purchase

   b) Update maximum profit if current profit is higher

   c) Update purchase price:
      purchase = min(purchase, prices[i])
      (always buy at the lowest price before selling)

3. After traversal:
   - profit contains the maximum possible profit
   - If prices only decrease, profit remains 0

Time Complexity: O(n)
Space Complexity: O(1)
*/

