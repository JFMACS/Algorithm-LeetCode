/**
 * HashSet的使用
 */
class Solution {
    public int largestRectangleArea(int[] heights) {
        int count = heights.length;
        int max = 0;
        HashSet hs = new HashSet();
        
        for (int i = 0; i < count; i++) {
            if( hs.contains(heights[i]) ) {
                continue;//去除已计算过的高度，减少计算量
            }
            hs.add(heights[i]);
            int height = heights[i];
            int weight = 0;
            int maxWeight = 0;
            for (int j = 0; j < count; j++) {
                if (heights[j] < height) {
                    if (weight > maxWeight) {
                        maxWeight = weight;
                    }
                    weight = 0;
                } else {
                    weight ++;
                }
            }
            if (weight > maxWeight) {
                maxWeight = weight;
            }
            if (maxWeight * height > max) {
                max = maxWeight * height;
            }
        }
        return max;
    }
}
