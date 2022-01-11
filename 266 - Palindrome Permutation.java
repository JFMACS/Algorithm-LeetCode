class Solution {
    public boolean canPermutePalindrome(String s) {
        
        Map<Character, Integer> map = new HashMap<>();
        int countOdd = 0;
        char ch;
        for(int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if(map.containsKey(ch)) {
                countOdd += (map.get(ch) % 2 == 0) ? 1 : -1;
                map.put(ch, map.get(ch) + 1);
            } else {
                countOdd ++;
                map.put(ch, 1);
            }
        }
        return countOdd <= 1;
    }
}