// { Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.io.*;

  public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}// } Driver Code Ends

class Solution {

    public boolean isValid(String s) {
        HashSet<String> h = new HashSet<String>();
        
        for(int i=0;i<256;i++){
            h.add(""+i);       // add number 0-255
        }
        int dot=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='.')
            dot++;
        }
        if(dot != 3) return false;   // check dot == 3
        
        String [] n = s.split("\\.");   // split given array
        if(n.length != 4) return false;
        
        for(String x : n){
            if(!(h.contains(x))) // if string not cotains 0-255
            return false;
        }
        return true;
        
    }
  
       
    
}
