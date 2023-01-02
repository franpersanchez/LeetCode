import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        int min_Value=Integer.MAX_VALUE;
        int max_benefit=0;
        
        for(int i=0; i<prices.length; i++){
            if(prices[i]<min_Value){
                min_Value=prices[i];
            }else if(prices[i]-min_Value>max_benefit){
                max_benefit=prices[i]-min_Value;
            }
        }
        return max_benefit;
    }
}