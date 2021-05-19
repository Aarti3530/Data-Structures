
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws Exception
	 {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        while(testCase-- > 0)
        {
            String data = br.readLine();
            Solution obj = new Solution();
            System.out.println(obj.isIsogram(data)?"1":"0");
            
        }
	 }
}// } Driver Code Ends



class Solution
{
    static boolean isIsogram(String data){
        
       HashMap<Character,Integer> h = new HashMap<Character,Integer>(data.length());
       for(int i=0;i<data.length();i++){
           char s = data.charAt(i);
           if(h.containsKey(s)){
               h.put(s,h.get(s)+1);
           }
           else
           h.put(s,1);
       }
       //System.out.println(h);
       for(Map.Entry<Character,Integer> entry:h.entrySet()){
           if(entry.getValue()>1)
           return false;
       }
       return true;
    }
}
