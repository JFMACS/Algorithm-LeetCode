class Solution {
    /**
     * 位运算
     * x & (x - 1) 结果将x二进制最小位的1变为0
     */
    public int[] countBits(int num) {
        int[] res = new int[num + 1];
        int count, number;
        for (int i = 0; i < num + 1; i++) {
            count = 0;
            number = i;
            while(number > 0) {
                number = number & (number - 1);
                count ++;
            }
            res[i] = count;
        }
        return res;
    }
}