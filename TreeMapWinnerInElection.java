// { Driver Code Starts
import java.io.*;
import java.util.*;

class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            
            for(int i = 0; i < n; i++)
                arr[i] = sc.next();
            
            Solution obj = new Solution();    
            String result[] = obj.winner(arr, n);
            System.out.println(result[0] + " " + result[1]);
            
           
        }
        
    }
}
// } Driver Code Ends


class Solution
{
    public static String[] winner(String arr[], int n)
    {
        TreeMap<String,Integer> t = new TreeMap<String,Integer>();
        for(int i=0;i<n;i++){
            String s = arr[i];
            if(t.containsKey(s)){
                t.put(s,t.get(s)+1);
            }
            else
                t.put(s,1);
        }
        String [] temp = new String[2];
        int max = (Collections.max(t.values()));   //getMax..
        for(Map.Entry<String,Integer> entry : t.entrySet()){
            if(max == entry.getValue()){
                temp[0] = entry.getKey();
                temp[1] = entry.getValue().toString();
                break;
            }
        }
        return temp;
    }
}
