public class Solution {

    /**
     * @param s 短字符串
     * @param t 完整字符串
     * @return 是否为子字符串
     */
    public static boolean isSubsequence(String s, String t) {
        if(s.equals("")) {
            return true;
        }
        if(t.equals("")) {
            return false;
        }
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        int curIndex = 0;
        for(char ch : charT) {
            if(charS[curIndex] == ch) {
                curIndex ++;
            }
            if(curIndex == charS.length) {
                break;
            }
        }
        return curIndex == charS.length;
    }
}
