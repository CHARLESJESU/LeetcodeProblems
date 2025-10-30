package divident;
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE&&divisor==-1){
            return Integer.MAX_VALUE;
        }
        int c=dividend/divisor;
        return c;
    }
}
public class dividentdivesor {
    public static void main(String[] args) {
        Solution a=new Solution();
        int c=a.divide(10, 3);
        System.out.print(c);
    }
}
