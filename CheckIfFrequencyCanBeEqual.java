// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String input[] = read.readLine().split(" ");
            String a = input[0];
            
            Solution ob = new Solution();
            if(ob.sameFreq(a)){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    }
}// } Driver Code Ends
class Solution {
    boolean sameFreq(String s) {
        HashMap<Character,Integer> h = new HashMap<Character,Integer>(s.length());
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(h.containsKey(ch)){
                h.put(ch,h.get(ch)+1);
            }else
            h.put(ch,1);
        }
        int min = h.get(s.charAt(0));
        int c = 0;
        for(Map.Entry<Character,Integer> entry : h.entrySet()){
            int t = entry.getValue();
            if(t == min);
            else if(min - 1 == t);
            else if(min + 1 == t);
            else
            c++;
        }
        if(c == 0 || c == 1)
        return true;
         
        return false;
    }
}
