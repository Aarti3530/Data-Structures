

import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java


class Solution { 
 
    static int firstElement(int arr[], int n, int k) { 
      LinkedHashMap<Integer,Integer> l = new LinkedHashMap<Integer,Integer>();
      for(int i=0;i<n;i++){
          if(l.containsKey(arr[i])){
              l.put(arr[i],l.get(arr[i])+1);
          }
          else{
              l.put(arr[i],1);
          }
      }
      for(Map.Entry<Integer,Integer> entry : l.entrySet()){
          if(entry.getValue() == k){
              int t = entry.getKey();
              return t;
          }
      }
      return -1;
    }
}

// { Driver Code Starts.

// Driver class
class GFG {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] a2 = line.trim().split("\\s+");
		    int n=Integer.parseInt(a2[0]);
		    int k=Integer.parseInt(a2[1]);
		    String line1 = br.readLine();
		    String[] a1 = line1.trim().split("\\s+");
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=Integer.parseInt(a1[i]);
		    }
		    Solution ob=new Solution();
		    int ans=ob.firstElement(a,n,k);
		    System.out.println(ans);
		    
		}
	}
}
 
