/**
 * 给定数组与限制数
 * 求最大数与最小数差小于或等于限制数的最长子数组长度
 */
class Solution {
    public int longestSubarray(int[] nums, int limit) {

        // 利用TreeMap实现，key可自动排序，对应的value标记key在当前窗口出现次数
        TreeMap<Integer, Integer> tree = new TreeMap<>();
        int left = 0;
        int max = 0;
        for (int right = 0; right < nums.length; right++) {
            tree.put(nums[right], tree.getOrDefault(nums[right], 0) + 1);
            while (tree.lastKey() - tree.firstKey() > limit) {
                tree.put(nums[left], tree.get(nums[left]) - 1);
                if (tree.get(nums[left]) == 0) {
                    tree.remove(nums[left]);
                }
                left ++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}