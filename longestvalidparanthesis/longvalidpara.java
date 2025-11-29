package longestvalidparanthesis;

import java.util.ArrayDeque;

class Solution{
     public int longestValidParentheses(String s) {
        if(s.length()==0||s==null) return 0;
        int maxlen=0;
ArrayDeque<Integer> stack=new ArrayDeque<>();
stack.push(-1);
int i=0;
while(i<s.length()){
    char c=s.charAt(i);
    if(c=='('){
        stack.push(i);
    }
    else{
        stack.pop();
        if(stack.isEmpty()){
            stack.push(i);
        }
        else{
            maxlen=Math.max(maxlen,i-stack.peek());
        }
    }
}
       return maxlen;
    }
}

public class longvalidpara {
 public static void main(String[] args) {
        Solution a=new Solution();
    int c=a.longestValidParentheses("(()())");
    System.out.print(c);
 }

}
