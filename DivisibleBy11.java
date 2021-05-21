
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
            String s = sc.next ();

    		System.out.println (new Sol().divisibleBy11 (s));
        }
        
    }
}

// Contributed By: Pranay Bansal// } Driver Code Ends


//User function Template for Java

class Sol
{
    int divisibleBy11 (String S)
    {
        int even = 0;
        int odd = 0;
        for(int i=0;i<S.length();i++){
            int t = Character.getNumericValue(S.charAt(i));
            if(i%2==0)
            even = even + t;
            else
            odd = odd + t;
        }
        if(even > odd){
            even = even - odd;
            if(even%11 == 0)
            return 1;
            else
            return 0;
        }
        else if(odd > even){
            odd = odd - even;
            if(odd%11 == 0)
            return 1;
            else
            return 0;
        }
        else
        return 1;
    }
}
