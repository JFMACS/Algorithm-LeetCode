/**
 * 两个相同长度的数组，A代表数量，B代表有无（0代表有）
 * 求若使制定长度的B全变为0，则A所有数量的和最大为多少
 */
public static int maxSatisfied(int[] customers, int[] grumpy, int X) {
    // sum: A数组的和； max: 窗口内可增加的最大数量； window: 窗口内可增加的数量
    int sum = 0;
    int max = 0;
    int window = 0;
    for (int i = 0; i < customers.length; i++) {
        if(grumpy[i] == 0) {
            sum += customers[i];
            // 在窗口滑动时，该数量不会从总数中减去
            customers[i] = 0;
        }
        if (i < X) {
            window += customers[i];
        } else {
            window = window - customers[i - X] + customers[i];
        }
        max = Math.max(max, window);
    }
    return max + sum;
}