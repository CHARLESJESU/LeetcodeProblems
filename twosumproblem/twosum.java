package twosumproblem;
import java.util.HashMap;
class Solution{
    public int[] twosum(int a[],int target){
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<a.length;i++){
            int complement=target-a[i];
            if(m.containsKey(complement)){
                return new int[]{m.get(complement),i};}
                m.put(a[i],i);
            }
            return new int[]{0,0};
        }
    
    }

public class twosum {
    public static void main(String[] args) {
        Solution b=new Solution();
        int a[]={2,7,2,11,15};
        int target=9;
        int[] result=b.twosum(a, target);
        System.out.println(result[0]+" "+result[1]);
    }
}
