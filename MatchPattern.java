// { Driver Code Starts
import java.util.*;
public class MSP
{	
    public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while (t-- != 0)
		{
			int n=sc.nextInt();
			ArrayList<String> s = new ArrayList<String>(n);
			for (int i=0;i<n;i++)
			    s.add(sc.next());
			String tt;
			tt=sc.next();
			GfG g=new GfG();
			ArrayList<String> res =g.findMatchedWords(s, tt);
			Collections.sort(res);
			for (int i = 0;i < res.size();i++)
			    System.out.print(res.get(i)+" ");
			System.out.println();

		}
	}
}// } Driver Code Ends


class GfG
{

public static ArrayList<String> findMatchedWords(ArrayList<String> dict, String pattern)
	{
	    ArrayList<String> l = new ArrayList<String>();
	    String temp = "";
	    int [] brr = new int [256];
	    for(int i=0;i<pattern.length();i++){
	        brr[pattern.charAt(i)] = i;
	    }
	    
	    for(int i=0;i<pattern.length();i++){
	        temp = temp + brr[pattern.charAt(i)];
	    }
	    
	    for(int i=0;i<dict.size();i++){
	        int []arr = new int[256];
	        String s = dict.get(i);
	        String t = "";
	        for(int j=0;j<s.length();j++){
	            char ch = s.charAt(j);
	            arr[ch] = j;
	        }
	        for(int a=0;a<s.length();a++){
	            t = t + arr[s.charAt(a)];
	        }
	        if(temp.equals(t))
	        l.add(s);
	    }
	    return l;
	}
}
