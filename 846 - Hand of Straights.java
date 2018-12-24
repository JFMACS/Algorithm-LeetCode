/**
 * 1. 先将数组排序
 * 2. 遍历，取出未使用过的数字，向后寻找下一张
 * 3. 将使用过的数字标记
 */
class Solution {
    public boolean isNStraightHand(int[] hand, int W) {
        if(hand.length % W != 0){
    		return false;
    	}
    	Arrays.sort(hand);
        int[] used = new int[hand.length];
        for(int i = 0; i < hand.length; i++){
            if(used[i] == 0){
                int count = 1;
                int current = hand[i];
                int j = i + 1;
                used[i] = 1;
                while(count < W) {
                    if(j >= hand.length){
                    	break;
                    }
                    if(current + 1 == hand[j] && used[j] == 0){
                        used[j] = 1;
                        count++;
                        current = hand[j];
                        j++;
                    }else{
                    	j++;
                    }
                }
                if(count != W){
                	return false;
                }
            }
        }
        return true;
    }
}
