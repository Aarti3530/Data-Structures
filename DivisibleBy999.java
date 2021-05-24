// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String N = sc.next();
                    Solution obj = new Solution();
                    
                    if(obj.isDivisible999(N))
                        System.out.println("Divisible");
                    
                    else
                        System.out.println("Not divisible");
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    boolean isDivisible999(String N)
    {
       int n = N.length();
       
       if(n == 1 && N.charAt(0) == '0')
       return true;
    
       if(n%3 == 1)
       N = "00"+N;
       if(n%3 == 2)
       N = "0" + N;
       int sum = 0;
       for(int i=0;i<N.length();i++){
           int temp = 0;
           temp += (N.charAt(i++)-'0')*100;
           temp += (N.charAt(i++)-'0')*10;
           temp += (N.charAt(i)-'0');
           
           sum += temp;
       }
       if(sum > 1000){
           N = Integer.toString(sum);
           n = N.length();
           sum = isDivisible999(N) ? 1:0;
       }
       return (sum == 999);
    }
}
