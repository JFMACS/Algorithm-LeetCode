    public static int findShortestSubArray(int[] nums) {
        /**
         * 数组的度表示相同数字出现的最高次数
         * 求与原数组的度相同的子数组的最小长度
         */
        int num;
        int degree = 0;
        int maxNum = 0;
        int minLen = 50000;
        int[][] record = new int[50000][3];
        // 二维数组
        // 一维表示对应数组
        // 二维的第一个数为该数字出现的次数 后两个数字表示在数组中的起始位置
        for (int i = 0; i < nums.length; i++) {
            num = nums[i];
            record[num][0] += 1;
            if(record[num][0] == 1) {
                record[num][1] = i;
                record[num][2] = i;
            } else {
                record[num][2] = i;
            }
            degree = Math.max(degree, record[num][0]);
            maxNum = Math.max(maxNum, num);
        }
        for (int i = 0; i <= maxNum; i++) {
            if (record[i][0] == degree) {
                minLen = Math.min(minLen, record[i][2] - record[i][1] + 1);
            }
        }
        return minLen;
    }