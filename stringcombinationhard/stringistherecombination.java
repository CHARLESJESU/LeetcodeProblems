package stringcombinationhard;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> mainresult = new ArrayList<>();
        int mainword = s.length();

        // Step 1: Generate all permutations of words
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        for (String c : words) {
            ArrayList<ArrayList<String>> newResult = new ArrayList<>();
            for (ArrayList<String> perm : result) {
                for (int i = 0; i <= perm.size(); i++) {
                    ArrayList<String> g = new ArrayList<>(perm);
                    g.add(i, c);
                    newResult.add(g);
                }
            }
            result = newResult; // ✅ moved here
        }

        // Step 2: Convert each permutation into a single concatenated string
        ArrayList<String> result2 = new ArrayList<>();
        for (ArrayList<String> z : result) {
            StringBuilder f = new StringBuilder();
            for (String q : z) {
                f.append(q);
            }
            result2.add(f.toString());
        }

        // Step 3: Check for each concatenation in the main string
        for (String m : result2) {
            int mword = m.length();
            for (int i = 0; i <= mainword - mword; i++) {
                if (s.substring(i, i + mword).equals(m)) {
                    if(!mainresult.contains(i)){
                    mainresult.add(i);}
                }
            }
        }

        return mainresult;
    }
}

public class stringistherecombination {
    public static void main(String[] args) {
        Solution a = new Solution();
        String[] m = {"a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a","a"};
        List<Integer> b = a.findSubstring("fffffffffffffffffffffffffffffffff", m);
        for (Integer q : b) {
            System.out.println(q);
        }
    }
}
