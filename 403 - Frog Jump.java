/*
递归
分别用两个HashSet记录所有石头位置与能够到达的石头位置
每跳一步，就将其位置记录，并递归计算接下来的三个可能位置
 */

class Solution {
    
    static HashSet canReach = new HashSet();
	static HashSet allStones = new HashSet();
	static HashSet<String> log = new HashSet<String>();//记录相同石头上相同步数，减少重复计算
	
	public static void jump(int position, int k) {
		
		if (log.contains(position + " " + k)) {
			return;
		}
		log.add(position + " " + k);
		if (!canReach.contains(position)) {
			canReach.add(position);
		}
		if (k != 1 && allStones.contains(position + k - 1)) {
			jump(position + k - 1, k - 1);
		}
		if (allStones.contains(position + k)) {
			jump(position + k, k);
		}
		if (allStones.contains(position + k + 1)) {
			jump(position + k + 1, k + 1);
		}
	}
	
    public static boolean canCross(int[] stones) {
    	allStones.clear();
    	canReach.clear();
        log.clear();
    	for (int i = 0; i < stones.length; i++) {
    		allStones.add(stones[i]);
    	}
    	if (!allStones.contains(1)) {
    		return false;
    	} else {
    		canReach.add(0);
    		jump(1,1);
    	}
    	return canReach.contains(stones[stones.length - 1]);
    }
}