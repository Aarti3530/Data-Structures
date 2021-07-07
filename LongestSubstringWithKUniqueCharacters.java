// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        int max = -1;
        HashMap<Character,Integer> h = new HashMap<Character,Integer>();
        for(int i=0,j=0;j<s.length();j++){
            char ch = s.charAt(j);
            if(!h.containsKey(ch)){
                h.put(ch,1);
            }else{
                h.put(ch,h.get(ch)+1);
            }
            if(h.size() == k){
                if(j-i+1 > max){
                    max = j-i+1;
                }
            }
            if(h.size() > k){
                while(h.size()>k){
                    char c = s.charAt(i);
                    h.put(c,h.get(c)-1);
                    if(h.get(c)<=0)
                    h.remove(c);
                    i++;
                }
            }
        }
        return max;
    }
}
