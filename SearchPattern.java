// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s, patt;
            s = sc.next();
            patt = sc.next();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.search(patt, s);
            
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println();    
        }
    }
}// } Driver Code Ends


class Solution
{
    
    ArrayList<Integer> search(String pat, String S)
    {
        ArrayList<Integer> l = new ArrayList<Integer>();
        if(!S.contains(pat)){
            l.add(-1);
            return l;
        }else{
            int n = pat.length();
            for(int i=0;i<S.length();i++){
                String s = "";
                if(n+i <= S.length())
                s = S.substring(i,n+i);
                
                if(s.equals(pat))
                l.add(i+1);
            }
            return l;
        }
    }
}
