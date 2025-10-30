package String_without_repeating;

import java.util.ArrayList;

class Solution{
     public int lengthOfLongestSubstring(String s) {
     ArrayList<Character> a=new ArrayList<Character>();
        int left=0;int maxlen=0;
    for(int right=0;right<s.length();right++){
        while (a.contains(s.charAt(right))) {
            a.remove((Character) s.charAt(left));
            left++;
        }
        a.add(s.charAt(right));
        maxlen=Math.max(maxlen, right-left+1);
    }
    return maxlen;
}
}

public class stringworepeating {
    public static void main(String[] args) {
        Solution a=new Solution();
        int b=a.lengthOfLongestSubstring("dvdf");
        System.out.println(b);
    }
}
