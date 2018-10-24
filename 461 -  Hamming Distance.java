/*
将x、y进行与或计算，再对结果进行遍历
 */
class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;
    	int z = x ^ y;
    	char[] ch = Integer.toBinaryString(z).toCharArray();
    	for (int i = 0; i < ch.length; i++) {
    		if (ch[i] == '1') {
    			count++;
    		}
    	}
    	return count;
    }
}