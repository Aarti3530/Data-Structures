// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    System.out.println(new Solution().evaluatePostFix(br.readLine().trim()));
		}
	}
}// } Driver Code Ends

class Solution
{
    
    public static int evaluatePostFix(String S) 
    {
        Stack<Integer> st = new Stack<Integer>();
        st.push(1);
        for(int i=0;i<S.length();i++){
            char ch = S.charAt(i);
            if(Character.isDigit(ch)){
                int t = (int)(ch-'0');
                st.push(t);
                //System.out.println(st+" ");
            }else{
                int s = st.pop();
                int f = st.pop();
                //System.out.println(st+" ");
                switch(ch)
                {
                    case '+':
                    st.push(f+s);
                    break;
                      
                    case '-':
                    st.push(f- s);
                    break;
                      
                    case '/':
                    if(f == 0 && s == 0){
                    st.pop();
                    st.push(0);
                    }
                    else
                    st.push(f/s);
                    break;
                      
                    case '*':
                    st.push(f*s);
                    break;
              }
            }
            //System.out.println(st+" ");
        }
        //System.out.println(st+" ");
        return st.peek();
    }
}
