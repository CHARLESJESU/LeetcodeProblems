package Firstoccurance;

class Solution {
    public int strStr(String haystack, String needle) {
        int h=haystack.length();
        int n=needle.length();
        for(int i=0;i<=h-n;i++){
            if(haystack.substring(i,i+n).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}

public class firstoccurance {
   public static void main(String[] args) {
        Solution a=new Solution();
    int b=a.strStr("CharlesChar","Charles");
    System.out.print(b);
   }
}
