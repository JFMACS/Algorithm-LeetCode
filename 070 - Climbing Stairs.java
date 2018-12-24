/**
 * 递归效率太低
 */
class Solution {
    public int climbStairs(int n) {
        int odd = 1;
        int even = 1;
        for(int i = 2 ; i <= n; i++){
            if(i % 2 == 1){
                odd += even;
            } else {
                even += odd;
            }
        }
        return (odd > even) ? odd : even;
    }
}
