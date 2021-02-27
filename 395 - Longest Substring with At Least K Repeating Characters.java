class Solution {
    /**
     * 求字符串s的最长子串 该字串的每一个字母出现次数不少于k
     */
    publicint longestSubstring(String s, int k) {
        // 递归实现
        // 使用split将字符串中不符合条件的字母除去 直至字符串全部字母符合条件并返回字符串长度
        int res = 0;
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a'] ++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0 && count[i] < k) {
                s = s.replaceAll(String.valueOf((char)(i + 'a')), " ");
            }
        }
        String[] S = s.split(" ");
        for (String str: S) {
            count = new int[26];
            int flag = str.length();
            for (int i = 0; i < str.length(); i++) {
                count[str.charAt(i) - 'a'] ++;
            }
            for (int i = 0; i < count.length; i++) {
                if (count[i] != 0 && count[i] < k) {
                    flag = longestSubstring(str, k);
                }
            }
            res = Math.max(res, flag);
        }
        return res;
    }
}