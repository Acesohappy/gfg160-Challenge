class Solution {
    public int maximumProfit(int prices[]) {
        int n=prices.length;
        int res=0;
        int min=prices[0];
        
        for(int i=1;i<n;i++)
        {
            if(min>prices[i])
            min=prices[i];
            
            if(res<(prices[i]-min))
            res=(prices[i]-min);
        }
        return res;
    }
}
