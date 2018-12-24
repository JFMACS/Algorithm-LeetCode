/**
 * 将其中一个数组转成list，遍历另一个找到重复的元素并将其从list中去除
 */
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        LinkedList<Integer> list = new LinkedList<Integer>();
    	List<Integer> resultList = new LinkedList<Integer>();
    	for (int i = 0; i < nums2.length; i++) {
			list.add(nums2[i]);
		}
    	for (int i = 0; i < nums1.length; i++) {
			int num = nums1[i];
			if(list.contains(num)){
				resultList.add(num);
				list.remove(list.indexOf(num));
			}
		}
    	int[] result = new int[resultList.size()];
    	for (int i = 0; i < resultList.size(); i++) {
			result[i] = resultList.get(i);
		}
    	return result;
    }
}
