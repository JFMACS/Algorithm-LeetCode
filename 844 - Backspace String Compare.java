class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack s = new Stack<>();
        Stack t = new Stack<>();
        char[] charS = S.toCharArray();
        char[] charT = T.toCharArray();
        for (char ch : charS) {
            if(ch != '#') {
                s.push(ch);
            } else if(!s.empty()) {
                s.pop();
            }
        }
        for (char ch : charT) {
            if(ch != '#') {
                t.push(ch);
            } else if(!t.empty()) {
                t.pop();
            }
        }
        return s.equals(t);
    }
}
