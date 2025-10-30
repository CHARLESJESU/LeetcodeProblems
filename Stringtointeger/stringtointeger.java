package Stringtointeger;
class Solution {
public int myAtoi(String s) {
s = s.trim();
if (s.isEmpty()) return 0;    int i = 0, sign = 1, result = 0;
    int n = s.length();


    if (s.charAt(i) == '+') {
        i++;
    } else if (s.charAt(i) == '-') {
        sign = -1;
        i++;
    }

    while (i < n && Character.isDigit(s.charAt(i))) {
        int digit = s.charAt(i) - '0';


        if (result > (Integer.MAX_VALUE - digit) / 10) {
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        result = result * 10 + digit;
        i++;
    }

    return result * sign;
}
}
public class stringtointeger {
    public static void main(String[] args) {
        Solution a=new Solution();
        int b=a.myAtoi("-564asda");
    System.out.println(b);}
}
