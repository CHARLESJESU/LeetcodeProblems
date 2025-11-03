package longestvalidparanthesis;

class Solution{
     public int longestValidParentheses(String s) {
        if(s.length()==0||s==null) return 0;
        int m=s.length();
        int i=1;
        int r=0;
        while(m>=0 && i<s.length()){
            if(s.charAt(i-1)=='(' && s.charAt(i)==')') r+=2;
            m--;
            i++;
        }
        return r;
    }
}

public class longvalidpara {
 public static void main(String[] args) {
        Solution a=new Solution();
    int c=a.longestValidParentheses("(()())");
    System.out.print(c);
 }

}
