class Solution {
    public boolean isStrobogrammatic(String num) {
        
        for(int i = 0; i <= num.length() / 2; i++) {
            if(!"696,00,11,88".contains(num.charAt(i) + "" + num.charAt(num.length() - 1 - i))) {
                return false;
            }
        }
        return true;
    }
}