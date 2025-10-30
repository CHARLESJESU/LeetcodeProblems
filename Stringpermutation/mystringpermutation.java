package Stringpermutation;

import java.util.ArrayList;

class Solution{
    public void permutation(String[] a){
        ArrayList<ArrayList<String>> result=new ArrayList<>();
       ArrayList<String> result2=new ArrayList<>();
        
        result.add(new ArrayList<>());
for(String c:a){
    ArrayList<ArrayList<String>> newResult=new ArrayList<>();
    for(ArrayList<String> perm:result){
        for(int i=0;i<=perm.size();i++){
            ArrayList<String> g=new ArrayList<>(perm);
            g.add(i,c);
            newResult.add(g);
        }
        result=newResult;
    }
  
    
}
  for(ArrayList<String> z:result){
        System.out.println(z);
    }


    }
}

public class mystringpermutation {
    public static void main(String args[]){
        Solution a=new Solution();
        String[] b={"1", "2", "3"};
        a.permutation(b);
    }
}
