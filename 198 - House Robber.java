/**
 * 动态规划
 * 计f(x)为到达第x家时可以获取的最大金额
 * 则f(x)为f(x-1)与f(x-2)+num(x)的较大值
 */

class Solution {
    public int rob(int[] nums) {
        int count = nums.length;
        if (count == 0){
            return 0;
        }
        if (count == 1){
            return nums[0];
        }
        int[] max = new int[count];
	    max[0] = nums[0];
	    max[1] = (nums[0] > nums[1]) ? nums[0] : nums[1];
    	for (int i = 2 ; i < count ; i++){
    	    max[i] = ((max[i - 2] + nums[i]) > max[i - 1]) ? (max[i - 2] + nums[i]) : max[i - 1];
    	}
        return max[count-1];
    }
}
