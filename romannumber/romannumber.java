package romannumber;

class Solution{
    
    public String intToRoman(int num) {
        int[] a={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String romen="";
   String[] b={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};

    for(int i=a.length-1;i>=0;i--){
        while((num-a[i])>=0){
            romen+=b[i];
            num=num-a[i];
        }
    }


        return romen;
    }
}

public class romannumber {
    public static void main(String[] args) {
        Solution a=new Solution();
        String g=a.intToRoman(749);
        System.out.println(g);
    }
}
