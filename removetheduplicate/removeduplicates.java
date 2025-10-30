package removetheduplicate;

import java.util.ArrayList;


    class Solution {
    public int removeDuplicates(int[] nums) {
        // HashMap<Integer,Integer> b=new HashMap<>();
        ArrayList<Integer> b=new ArrayList<>();
        int a=0;
        for(int i=0;i<nums.length;i++){
                if(!b.contains(nums[i])){
                    b.add(nums[i]);
                    a++;
                }
        }
        
        return a;
    }
}

public class removeduplicates {
    public static void main(String[] args) {
        Solution a=new Solution();
        int[] b={1,1,2};
        int c=a.removeDuplicates(b);
        System.out.println(c);
    }
}
