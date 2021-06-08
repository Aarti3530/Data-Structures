// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            int M[][] = new int[N][N];
            String arr[] = in.readLine().trim().split("\\s+");
            for(int i = 0;i < N*N; i++)
                M[i/N][i%N] = Integer.parseInt(arr[i]);
                
            Solution ob = new Solution();
            System.out.println(ob.distinct(M, N));
        }
    }
}// } Driver Code Ends

class Solution{
    static int distinct(int M[][], int N)
    {
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        
        for(int i=0;i<N;i++)
        h.put(M[0][i],0);
        
        for(int i=1;i<N;i++){
            for(int j=0;j<N;j++){
                if(h.containsKey(M[i][j]) && h.get(M[i][j]) == i-1){
                    h.put(M[i][j],i);
                }
            }
        }
        int c = 0;
        for(Map.Entry<Integer,Integer> entry : h.entrySet()){
            if(entry.getValue() == N-1)
            c++;
        }
        return c;
    }
}
