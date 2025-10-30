package telephonecom;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) { return result;}
        result.add("");
        String[] map = {"", "", "abc", "def", "ghi", "jkl","mno","pqrs","tuv","wxyz"};
        for(int i=0;i<digits.length();i++){
            List<String> temp = new ArrayList<>();
        String letter=map[digits.charAt(i)-'0'];
        for(String s:result){
            for(int j=0;j<letter.length();j++){
                temp.add(s+letter.charAt(j));

            }}
            result=temp;
       }
      
       return result;
    }
}
public class lettercom {
    public static void main(String[] args) {
        Solution a=new Solution();
        System.out.println(a.letterCombinations("23"));
    }
}
