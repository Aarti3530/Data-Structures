
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while(t > 0){
            String S = sc.nextLine();
            Solution ob = new Solution();
            System.out.println(ob.extractMaximum(S)); 
            t--;
        }
    } 
} 


// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static int extractMaximum(String S) 
    { 
        int max = 0,num = 0,flag=0;
        for(int i=0;i<S.length();i++){
            if(Character.isDigit(S.charAt(i))){
                num = num*10 + (S.charAt(i)-'0');
                flag = 1;
            }
            else{
                max = Math.max(max,num);
                num = 0;
            }
        }
        if(flag == 1)
        return Math.max(max,num);
        else
        return -1;
      
    }    
} 
