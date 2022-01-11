class Solution {
    public List<String> generatePossibleNextMoves(String currentState) {

        List<String> results = new ArrayList<>();
        char[] chs = currentState.toCharArray();
        for(int i = 0; i < currentState.length() - 1; i++) {
            if(currentState.charAt(i) == '+' && currentState.charAt(i + 1) == '+') {
                chs[i] = chs[i + 1] = '-';
                results.add(String.valueOf(chs));
                chs = currentState.toCharArray();
            }
        }
        return results;
    }
}