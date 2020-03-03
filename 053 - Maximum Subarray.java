public class Solution {
    /**
     * 遇到负数判断是否舍弃的逻辑：只要该负数前的最大和大于该负数绝对值，就不应该舍弃
     * 
     * @param nums 数组
     * @return 最大和
     */
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        // 当只有一个负数时
        int res = nums[0];
        for (int num : nums) {
            sum = sum > 0 ? (sum + num) : num;
            res = sum > res ? sum : res;
        }
        return res;
    }
}
