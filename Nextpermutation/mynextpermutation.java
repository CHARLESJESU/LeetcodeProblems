package Nextpermutation;

class Solution{
     public void nextPermutation(int[] nums) {
        if(nums==null||nums.length==0) System.out.println("");
        if(nums[0]>=nums[1]&&nums[1]>=nums[2]){
            System.out.println(""+nums[2]+""+nums[1]+""+nums[0]);
        }
        else{
            System.out.println(""+nums[0]+""+nums[2]+""+nums[1]);
        }
    }
}
public class mynextpermutation {
    public static void main(String args[]){
        Solution a=new Solution();
        int[] nums={3,1,2};
        a.nextPermutation(nums);
    }
}
