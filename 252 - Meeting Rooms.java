class Solution {
    public boolean canAttendMeetings(int[][] intervals) {

        int[] occupy = new int[1000000];
        for(int i = 0; i < intervals.length; i++) {
            for(int j = intervals[i][0] + 1; j < intervals[i][1]; j++) {
                if(occupy[j] > 0) {
                    return false;
                }
                occupy[j] = 2;
            }
            if(occupy[intervals[i][0]] == 2 || occupy[intervals[i][1]] == 2) {
                return false;
            }
            occupy[intervals[i][0]] = 1;
            occupy[intervals[i][1]] = 1;
        }
        return true;
    }
}