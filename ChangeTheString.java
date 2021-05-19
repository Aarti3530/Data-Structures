
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
            String s = sc.next ();
            Solution ob = new Solution();
            String ans = ob.modify(s);
            System.out.println(ans);
        }
        
    }
}// } Driver Code Ends


class Solution{
    String modify(String s){
        boolean up = false;
        boolean low = false;
        
        if(Character.isUpperCase(s.charAt(0)))
        up = true;
         
        else if(Character.isLowerCase(s.charAt(0)))
        low = true;
        
        if(up)
        return s.toUpperCase();
        
        else if(low)
        return s.toLowerCase();
        
        else
        return s;
    }
}

//https://practice.geeksforgeeks.org/problems/change-the-string3541/1/?category[]=Strings&category[]=Strings&problemStatus=unsolved&difficulty[]=-1&page=1&query=category[]StringsproblemStatusunsolveddifficulty[]-1page1category[]Strings
