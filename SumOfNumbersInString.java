import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st=new StringTokenizer(br.readLine());
	    int t=Integer.parseInt(st.nextToken());
	    while(t-->0){
	        String s=br.readLine();
	        
	        Solution obj = new Solution();
	        
	        System.out.println(obj.findSum(s));
	    }
		
	}
}
// } Driver Code Ends

class Solution
{
    public static long findSum(String str)
    {
        String s = "0";
        long sum =0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                s = s+ch;
            }
            else{
                
                sum = sum + Long.parseLong(s);
                s="0";
                
               }
        }
        return sum+Long.parseLong(s);
    }
    
}
