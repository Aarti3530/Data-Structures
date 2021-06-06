// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])
    {
        //Taking input using class Scanner 
        Scanner sc = new Scanner(System.in);
        
        //Taking the number of testcases
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            //taking the range
            int n = sc.nextInt();
            
            //creating an ArrayList
            ArrayList<String> res = new ArrayList<String>();
            
            //calling the generate method of class solve
            //and storing the result in an ArrayList
            res = new solve().generate(n);
            
            //printing all the elements of the ArrayList
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends

class solve{
    static ArrayList<String> generate(int N)
    {
         ArrayList<String> l = new ArrayList<String>();
         String binary = "";
         int num = N;
         for(int j=0;j<N;j++){
         for(int i=num;i>0;i=i/2){
             binary = binary + i%2;
         }
         l.add(new StringBuilder(binary).reverse().toString());
         binary = "";
         num--;
         }
         Collections.reverse(l);
         return l;
    }
    
}
