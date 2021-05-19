// https://practice.geeksforgeeks.org/problems/unique-numbers3019/1/?category[]=Hash&category[]=Hash&difficulty[]=-2&difficulty[]=-1&page=1&query=category[]Hashdifficulty[]-2difficulty[]-1page1category[]Hash
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            
            
            int l=sc.nextInt();
			int r=sc.nextInt();
			Solution ob = new Solution();
			ArrayList<Integer> numbers = ob.uniqueNumbers(l,r);
			for(int num : numbers){
			    System.out.print(num+" ");
			}
			System.out.println();

        }
    }
}
// } Driver Code Ends


class Solution{

    static ArrayList<Integer> uniqueNumbers(int L,int R){
        
       ArrayList<Integer> a = new ArrayList<Integer>();    
       for(int i=L;i<=R;i++){
           
           String s = ""+i;
           HashSet<Character> set = new HashSet<Character>();
           for(int j=0;j<s.length();j++){
           char ch = s.charAt(j); // unique elements
           set.add(ch);
               
           }
           
           if(s.length() == set.size()){
               a.add(i);
           }
       }
       return a;
    }
}
