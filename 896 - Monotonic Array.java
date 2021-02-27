class Solution {
    /**
     * 判断数组是否单调递增或单调递减
     */
    public boolean isMonotonic(int[] A) {
        int n = 1;
        if (A[0] > A[A.length - 1]) {
            n = -1;
        }
        for (int i = 0; i < A.length - 1; i++) {
            if (n * A[i] > n * A[i + 1]) {
                return false;
            }
        }
        return true;
    }
}