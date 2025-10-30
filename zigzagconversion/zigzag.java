package zigzagconversion;

import java.util.ArrayList;

class Solution {
    public String convert(String s, int numRows) {
        if (s == null || s.length() == 0 || numRows == 1) return s;
        StringBuilder[] row=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            row[i]=new StringBuilder();
        }
        int currentrow=0;
        boolean goingdown=false;
        for(char c:s.toCharArray()){
            row[currentrow].append(c);
            if(currentrow==0||currentrow==numRows-1){
                goingdown=!goingdown;
            }
            if(goingdown){
                currentrow++;
            }
         else{
                currentrow--;
            }}
            StringBuilder result=new StringBuilder();
            for(StringBuilder rows:row){
                result.append(rows);
            }
            return result.toString();
        }

    }

public class zigzag {
    public static void main(String[] args) {
        Solution a=new Solution();
        String g=a.convert("Padjfklsksls", 4);
        System.out.println(g);
    }
}
