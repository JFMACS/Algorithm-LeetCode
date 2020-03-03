public class Solution {

    /**
     * 原题可理解为收费站，cost代表收费站的费用，每进入一个收费站则可选择跳过下一个收费站
     * @param cost 进入收费站的费用
     * @return 到达终点的最小花费
     */
    public static int minCostClimbingStairs(int[] cost) {
        int[] minCost = new int[cost.length];
        for (int i = 0; i < cost.length; i++) {
            switch (i) {
                case 0 : minCost[i] = 0; break;
                case 1 : minCost[i] = Math.min(cost[0], cost[1]); break;
                case 2 : minCost[i] = Math.min(cost[0] + cost[2], cost[1]); break;
                default: minCost[i] = Math.min((minCost[i - 3] + cost[i - 2] + cost[i]), (minCost[i - 2] + cost[i - 1]));
            }
        }
        return minCost[minCost.length - 1];
    }
}
