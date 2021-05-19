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
            String string1 = read.readLine();
            String string2 = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.removeChars(string1,string2) );
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static String removeChars(String string1, String string2){
        int s = string2.length();
        for(int i=0;i<s;i++){
            String ch = ""+string2.charAt(i);
            if(string1.contains(ch));
            string1 = string1.replace(ch,"");
        }
        return string1;
    }
}
