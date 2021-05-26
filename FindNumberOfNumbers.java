// { Driver Code Starts
import java.util.*;
class Numbers{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0)
	{
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i = 0; i < n; i++)
		{
			a[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		GfG g=new GfG();
		System.out.println(g.num(a,n,k));
	}
}
}// } Driver Code Ends


class GfG
{
          public static int num(int a[], int n, int k)
            {
                String s = "";
                for(int i=0;i<n;i++){
                   s = s + "" + a[i]; 
                }
                int c=0;
                for(int i=0;i<s.length();i++){
                    char ch = s.charAt(i);
                    if(ch-'0' == k)
                    c++;
                }
                return c;
            }
}
