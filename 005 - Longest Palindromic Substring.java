/*
1.循环从中间向两边延伸
2.遇到相邻相同的字符，需分两种情况
 */

public static String longestPalindrome(String s) {
    String result = "";
    char[] ch = s.toCharArray();
    if (s.length() == 1) {
        return s;
    }
    int start, end;
    int len = s.length();
    int max = 0;
    for (int i = 0; i < len; i++) {
        start = end = i;
        while(start >= 0 && end < len && ch[start] == ch[end]){
            start --;
            end ++;
        }
        start ++;
        end --;
        if(end - start + 1 >= max){
            max = end - start + 1;
            result = s.substring(start, end+1);
        }
        if(i + 1 < len && ch[i + 1] == ch[i]){
            start = i;
            end = i + 1;
            while(start >= 0 && end < len && ch[start] == ch[end]){
                start --;
                end ++;
            }
            start ++;
            end --;
            if(end - start + 1 >= max){
                max = end - start + 1;
                result = s.substring(start, end+1);
            }
        }

    }
    return result;
}