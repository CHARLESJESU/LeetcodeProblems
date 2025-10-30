import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') || 
                    (c == '}' && top != '{') || 
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

public class paranthesis {
    public static void main(String[] args) {
        Solution a = new Solution();
        System.out.println(a.isValid("()[]"));   // true
        System.out.println(a.isValid("(]"));     // false
        System.out.println(a.isValid("([)]"));   // false
        System.out.println(a.isValid("{[]}"));   // true
        System.out.println(a.isValid("((("));    // false
    }
}
