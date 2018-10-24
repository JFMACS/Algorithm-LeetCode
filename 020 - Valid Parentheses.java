/*
使用Stack类实现
 */
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
        	char top;
        	if (stack.size() != 0) {
        		top = stack.peek();
        	} else {
				top = ' ';
			}
        	switch (ch[i]) {
			case ')':
				if (top != '(') {
					return false;
				}
				stack.pop();
				break;
			case ']':
				if (top != '[') {
					return false;
				}
				stack.pop();
				break;
			case '}':
				if (top != '{') {
					return false;
				}
				stack.pop();
				break;
			default:
				stack.push(ch[i]);
				break;
			}
        }
        if (stack.size() != 0) {
        	return false;
        }
        return true;
    }
}
