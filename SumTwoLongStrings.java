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
            String x = read.readLine();
            String y = read.readLine();
            Solution ob = new Solution();
            String result = ob.findSum(x,y);
            
            System.out.println(result);
        }
    }
}// } Driver Code Ends

class Solution {
    String findSum(String str1, String str2) {
        if (str1.length() > str2.length()){
        String t = str1;
        str1 = str2;
        str2 = t;
    }
 
    // Take an empty String for storing result
    String str = "";
 
    // Calculate length of both String
    int n1 = str1.length(), n2 = str2.length();
 
    // Reverse both of Strings
    str1=new StringBuilder(str1).reverse().toString();
    str2=new StringBuilder(str2).reverse().toString();
 
    int carry = 0;
    for (int i = 0; i < n1; i++)
    {
        // Do school mathematics, compute sum of
        // current digits and carry
        int sum = ((int)(str1.charAt(i) - '0') +
                    (int)(str2.charAt(i) - '0') + carry);
        str += (char)(sum % 10 + '0');
 
        // Calculate carry for next step
        carry = sum / 10;
    }
 
    // Add remaining digits of larger number
    for (int i = n1; i < n2; i++)
    {
        int sum = ((int)(str2.charAt(i) - '0') + carry);
        str += (char)(sum % 10 + '0');
        carry = sum / 10;
    }
 
    // Add remaining carry
    if (carry > 0)
        str += (char)(carry + '0');
 
    // reverse resultant String
    str = new StringBuilder(str).reverse().toString();
     String strPattern = "^0+(?!$)";
     str = str.replaceAll(strPattern,"");
     if(str.length() == 0)
     return "0";
 
    return str;
    }
}
