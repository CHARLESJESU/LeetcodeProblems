package Stringcombinationusinghash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution{
    public List<Integer> findSubstring(String s, String[] words) {
        HashMap<String,Integer> m=new HashMap<>();
        List<Integer> result=new ArrayList<>();
        for(String i:words){
            m.put(i, m.getOrDefault(i,0)+1);
        }
        // for(String i:words){
        //     System.out.print(m.get(i));
        // }
        int wordlen=words[0].length();
        int totellen=wordlen*(words.length);
        for(int i=0;i<=s.length()-totellen;i++){
            String part=s.substring(i,i+totellen);
            String smallpa=part.substring(i,i+wordlen);
            HashMap<String,Integer> g=new HashMap<>();
            if(!m.containsKey(smallpa)){
                break;
            }
            for(int j=0;j<totellen;j+=wordlen){
                String r=part.substring(j,j+wordlen);
                if(!m.containsKey(r)){break;}

                        g.put(r, g.getOrDefault(r, 0)+1);
                        if(g.get(r)>m.get(r)){
                            break;
                        }
                
            }
            if(g.equals(m)){
                result.add(i);
            }
            
        }
        return result; 
    }
}

public class stringcombinationwithhash {
    public static void main(String[] args) {
        Solution a=new Solution();
        String[] words={"foo","bar"};
        List<Integer> y=a.findSubstring("barfoothefoobarman", words);
        for(int q:y){
            System.out.print(q);
        }
    }
}
