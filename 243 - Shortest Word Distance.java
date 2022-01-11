class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {

        HashMap<String, List<Integer>> postions = new HashMap<>();
        for(int i = 0; i < wordsDict.length; i++) {
            if(!postions.containsKey(wordsDict[i])) {
                postions.put(wordsDict[i], new ArrayList<>());
            }
            postions.get(wordsDict[i]).add(i);
        }
        int minLen = Integer.MAX_VALUE;
        List<Integer> postion1 = postions.get(word1);
        List<Integer> postion2 = postions.get(word2);
        for(Integer i: postion1) {
            for(Integer j: postion2) {
                minLen = Math.min(Math.abs(i - j), minLen);
            }
        }
        return minLen;
    }
}