class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {

        List<String> rangeList = new ArrayList<String>();
        String range = "";
        int low = lower;
        int up = lower;
        int num;

        for(int i = 0; i < nums.length; i++) {
            num = nums[i];
            if(low != num) {
                up = num - 1;
                if(low == up) {
                    rangeList.add(String.valueOf(low));
                } else {
                    rangeList.add(low + "->" + up);
                }

            }
            low = up = num + 1;
        }
        if(up < upper) {
            rangeList.add(low + "->" + upper);
        }
        if(up == upper) {
            rangeList.add(String.valueOf(upper));
        }
        return rangeList;
    }
}