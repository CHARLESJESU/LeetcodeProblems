package paliornot;
class Solution {
    public boolean isPalindrome(int x) {
        int result=0;
        int a=x;
        int digit;
        while(x>0){
            digit=x%10;
            result=(result*10)+digit;
            x/=10;
        }
      
        return result==a?true:false;
    }
}
public class palindromecheck {
    public static void main(String[] args) {
        Solution a=new Solution();
        boolean m=a.isPalindrome(121);
        System.out.println(m);
    }
}
