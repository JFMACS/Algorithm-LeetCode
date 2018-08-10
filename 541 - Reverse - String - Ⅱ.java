class Solution {
    public String reverseStr(String s, int k) {
        String result = "";
        int count = s.length() / k;

        int i;
        for(i = 0; i < count; ++i) {
            if (i % 2 == 0) {
                result = result + (new StringBuffer(s.substring(i * k, (i + 1) * k))).reverse().toString();
            } else {
                result = result + s.substring(i * k, (i + 1) * k);
            }
        }

        if (i % 2 == 0) {
            result = result + (new StringBuffer(s.substring(i * k))).reverse().toString();
        } else {
            result = result + s.substring(i * k);
        }

        return result;
    }
}