public class Solution {
    /**
     * @param path 简化前的路径
     * @return 简化后的路径
     */
    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] folds = path.split("/");
        for (String fold : folds) {
            if(!"".equals(fold)) {
                if("..".equals(fold)) {
                    if(!stack.empty()) {
                        stack.pop();
                    }
                } else if(!".".equals(fold)) {
                    stack.push(fold);
                }
            }
        }
        String res = "/";
        if(!stack.empty()) {
            Stack<String> temp = new Stack<>();
            while(!stack.empty()) {
                temp.push(stack.pop());
            }
            while(!temp.empty()) {
                res += temp.pop() + "/";
            }
            res = res.substring(0, res.length() - 1);
        }
        return res;
    }
}
