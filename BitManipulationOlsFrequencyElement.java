import java.io.*;
import java.util.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {

	Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int [] arr = new int[n];

   for(int i=0;i<n;i++)
   arr[i] = sc.nextInt();

   int t = arr[0];
   for(int i=1;i<n;i++)
   t = t^arr[i];

   System.out.println(t);

   }
}
