package longestcommonprefix;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";


        String min = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < min.length()) {
                min = strs[i];
            }
        }

        for (int i = 0; i < min.length(); i++) {
            char ch = min.charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].charAt(i) != ch) {
                    return min.substring(0, i);
                }
            }
        }

        return min; 
    }
}

public class longcomprefix {
    public static void main(String[] args) {
        Solution a = new Solution();
        String[] strs = {"dog","racecar","car"};
        String result = a.longestCommonPrefix(strs);
        System.out.println(result); 
    }
}
