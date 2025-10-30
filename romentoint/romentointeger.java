
package romentoint;
class Solution {
    public int romanToInt(String s) {
         int[] a={4,9,40,90,400,900,1000,500,100,50,10,5,1};
        int inteofromen=0;
   String[] b={"IV","IX","XL","XC","CD","CM","M","D","C","L","X","V","I"};
   for(int i=0;i<b.length;i++){
   if(s.contains(b[i])){
    while(s.contains(b[i])){
        inteofromen+=a[i];
        s=s.replaceFirst(b[i],"");
    }
   }
   }
        return inteofromen;
    }
}
public class romentointeger {
    public static void main(String[] args) {
        Solution a = new Solution();
        int result = a.romanToInt("MCMXCIV");
        System.out.println(result); // Example usage
    }
    
}
