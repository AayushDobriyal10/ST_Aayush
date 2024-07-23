package Week_2.Day2;
class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        for(int i = 0 ; i <  prices.length-1 ; i++){
            for(int j = i+1 ; j < prices.length ; j++){
                maxprofit = Math.max(maxprofit , (prices[j]-prices[i]));
            }
        }
        return maxprofit;
    }
}
class Solution2 {
    public int maxProfit(int[] prices) {
        int minelement = prices[0];
        int maxprofit = 0;
        for (int i = 0; i < prices.length ; i++) {
            if(minelement<prices[i])
                maxprofit = Math.max(maxprofit, (prices[i]-minelement));
            else
            minelement = prices[i];
        }
        return maxprofit;
    }
}
public class BestTimeToSell {
    
}
