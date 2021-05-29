// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Compute obj = new Compute();
            long[] product = obj.minAnd2ndMin(a, n); 
            if(product[0]==-1)
                System.out.println(product[0]);
            else
                System.out.println(product[0]+" "+product[1]);
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Compute 
{
    public long[] minAnd2ndMin(long a[], long n)  
    {
        if(a.length < 2){
            long [] l = new long[1];
            l[0] = -1;
        return l;
        }
        else{
            Arrays.sort(a);
            long small = a[0];
            long second = a[1];
            if(small == second){
            TreeSet<Long> h = new TreeSet<Long>();
            for(int i=0;i<n;i++){
                h.add(a[i]);
            }
            Iterator it = h.iterator();
            if(it.hasNext())
            small = (long)it.next();
            else {
                long [] p = new long[1];
            p[0] = -1;
            return p;
            }
            if(it.hasNext())
            second = (long)it.next();
            else{
                long [] p = new long[1];
            p[0] = -1;
            return p;
            }
           }
            long [] l = new long[2];
            l[0] = small;
            l[1] = second;
            return l;
        }
    }
}
