/*
 * 建议不要使用递归
 * 使用数组存储计算比较省内存，但比较耗时间
 * 使用for循环计算比较省时间，但比较耗内存
 **/
class Solution {
    public static long[] ways = new long[1000001];
    public int waysToStep(int n) {
        calWays();
        return (int)ways[n];
    }

    public static void calWays() {
        ways[0] = ways[1] = 1;
        ways[2] = 2;
        for (int i = 3; i < ways.length; i++) {
            ways[i] = (ways[i - 1] + ways[i - 2] + ways[i - 3]) % 1000000007;
        }
    }
}