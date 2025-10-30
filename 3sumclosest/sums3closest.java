
import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int cos=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(Math.abs(sum-target)<Math.abs(cos-target)){
                    cos=sum;
                }
                if(sum<target){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return cos;
    }
}

public class sums3closest {
    public static void main(String[] args) {
        Solution a=new Solution();
        int[] nums={-1,2,1,-4};
        int n=a.threeSumClosest(nums, 1);
        System.out.print(n);
    }
}
