class Solution {
    public int maxProfit(int[] prices) {
       int minBuy = Integer.MAX_VALUE;
       int maxProfit = 0;
       
       for ( int i = 0; i<prices.length-1; i++){
           if(prices[i] < minBuy) minBuy = prices[i];
           if (prices[i+1] - minBuy > maxProfit) maxProfit = prices[i+1] - minBuy;
       }
       
       return maxProfit;
}
}