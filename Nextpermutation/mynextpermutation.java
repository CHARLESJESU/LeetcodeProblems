package Nextpermutation;

class Solution{
     public void nextPermutation(int[] nums) {
        if(nums.length<=1||nums==null) return;
        int n=nums.length;
        int i=n-2;
        while(nums[i]>=nums[i+1]&&i>=0) i--;
        if(i>=0){
            int j=n-1;
            while(nums[j]<=nums[i]) j--;
            swap(nums,i,j);
        }
        reverse(nums, i+1,n-1);
  
}
   private void swap(int[] a, int l,int r){
            int temp=a[l];
            a[l]=a[r];
        a[r]=temp;        }

    private void reverse(int[] a,int l, int r){
        while(l<r) swap(a, l++, r--);
    }
    }

public class mynextpermutation {
    public static void main(String args[]){
        Solution a=new Solution();
        int[] nums={3,2,1};
        a.nextPermutation(nums);
    }
}
