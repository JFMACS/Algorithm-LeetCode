/**
 * 动态规划
 * 遍历数组同时记录前面最低价格
 * 再计算当前卖出的收益与之前的最大值相比较
 */
class Solution {
    public int maxProfit(int[] prices) {
        int earn = 0;
        if(prices.length == 0){
            return 0;
        }
        int buy = prices[0];
        for (int i = 0; i < prices.length; i++){
            buy = (buy < prices[i]) ? buy : prices[i];
            earn = (earn > (prices[i] - buy)) ? earn : (prices[i] - buy);
        }
        return earn;
    }
}
