public class Solution extends Reader4 {
    
    public int read(char[] buf, int n) {

        char[] buf4 = new char[4];
        int count = 0;
        int flag = n;

        while(count < n && flag > 0) {
            flag = read4(buf4);
            for(int i = 0; i < flag && count < n; i++) {
                buf[count++] = buf4[i];
            }
        }
        return count;
    }
}