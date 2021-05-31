// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.Map.Entry;


class Driverclass 
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(sc.readLine());
	    while(n != 0)
		{
			int size = Integer.parseInt(sc.readLine());
			int arr[] = new int[size];
			String[] temp = sc.readLine().trim().split("\\s+");
			
			for(int i = 0; i < size; i++)
			    arr[i] = Integer.parseInt(temp[i]);
			    
			 ArrayList<Integer> ans = new ArrayList<Integer>();
			 ans = new Solution().sortByFreq(arr, size);
			 for(int i=0;i<ans.size();i++)
			    System.out.print(ans.get(i)+" ");
		    System.out.println();
			n--;
		}
	}
}

// } Driver Code Ends

class Solution
{
    public static <K, V extends Comparable<V> > Map<K, V> valueSort(final Map<K, V> map)
    {
        Comparator<K> valueComparator = new Comparator<K>() {
                  public int compare(K k1, K k2)
                  {
                      int comp = map.get(k2).compareTo(map.get(k1));
                      if (comp == 0)
                          return 1;
                      else
                          return comp;
                  }
            
              };
        Map<K, V> sorted = new TreeMap<K, V>(valueComparator);
        
        sorted.putAll(map);
        
        return sorted;
    }
    static ArrayList<Integer> sortByFreq(int arr[], int n)
    {
        TreeMap<Integer,Integer> t = new TreeMap<Integer,Integer>();
        
        for(int i=0;i<n;i++){
            if(t.containsKey(arr[i]))
            t.put(arr[i],t.get(arr[i])+1);
            else
            t.put(arr[i],1);
        }
        ArrayList<Integer> l = new ArrayList<Integer>();
        Map sorted = valueSort(t);
        Set set = sorted.entrySet();
        Iterator i = set.iterator();
        while(i.hasNext()){
            Map.Entry mp = (Map.Entry)i.next();
            int c = (int)mp.getKey();
            int v = (int)mp.getValue();
            for(int j=0;j<v;j++){
                l.add(c);
            }
        }
        return l;
        
    }
}
