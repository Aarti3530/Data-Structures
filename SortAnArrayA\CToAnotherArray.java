// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.HashMap; 
import java.util.Map; 
import java.util.Map.Entry; 


 // } Driver Code Ends

class Solution{
    public static int[] sortA1ByA2(int A1[], int N, int A2[], int M)
    {
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        for(int i=0;i<A1.length;i++){
            if(h.containsKey(A1[i]))
            h.put(A1[i],h.get(A1[i])+1);
            else
            h.put(A1[i],1);
        }
        int c = 0;
        for(int i=0;i<A2.length;i++){
            if(h.containsKey(A2[i])){
                for(int j=0;j<h.get(A2[i]);j++){
                    A1[c++] = A2[i];
                }
                h.remove(A2[i]);
            }
        }
        ArrayList<Integer> l = new ArrayList<Integer>(h.size());
        for(Map.Entry<Integer,Integer> entry : h.entrySet()){
            l.add(entry.getKey());
            for(int i=1;i<entry.getValue();i++)
            l.add(entry.getKey());
        }
        h.clear();
        Collections.sort(l);
        for(int i=0;i<l.size();i++){
            A1[c++] = l.get(i);
        }
        return A1;
    }
}



// { Driver Code Starts.
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    int a1[]=new int[n];
		    int a2[]=new int[m];
		    
		    for(int i=0;i<n;i++)
		    a1[i]=sc.nextInt();
		    
		    for(int i=0;i<m;i++)
		    a2[i]=sc.nextInt();
		    Solution ob=new Solution();
		    a1 = ob.sortA1ByA2(a1,n,a2,m);
		    for(int x:a1)
		    System.out.print(x+" ");
		    
		    System.out.println();
		}
	}
	

}


  // } Driver Code Ends
