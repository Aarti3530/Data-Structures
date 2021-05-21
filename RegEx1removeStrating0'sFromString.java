import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String a = sc.next ();
            String b = sc.next();
            Solution obj = new Solution();
    		System.out.println (obj.check (a, b));
        }
        
    }
}// } Driver Code Ends



class Solution
{
    int check (String a, String b)
    {
      String strPattern = "^0+(?!$)"; // RegEx Expression... to remove 0's from the string in starting 
      a = a.replaceAll(strPattern, "");
      b = b.replaceAll(strPattern, "");
      
       if(a.length() < b.length())
       return 1;
       
       else if(a.length() > b.length())
       return 2;
       
       else{
           for(int i=0;i<a.length();i++){
               char ch1 = a.charAt(i);
               char ch2 = b.charAt(i);
               if(Character.getNumericValue(ch1) == Character.getNumericValue(ch2)){
                   continue;
               }
               else if(Character.getNumericValue(ch1) > Character.getNumericValue(ch2)){
                   return 2;
               }
               else if(Character.getNumericValue(ch1) < Character.getNumericValue(ch2)){
                   return 1;
               }
           }
           return 3;
       }
    }
}

//https://practice.geeksforgeeks.org/problems/compare-two-large-numbers3413/1#
