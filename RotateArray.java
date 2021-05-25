/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		    int n = sc.nextInt();
		    int d = sc.nextInt();
		    Integer []arr = new Integer[n];
		    
		    for(int i=0;i<n;i++)
		    arr[i] = sc.nextInt();
		    
		    Collections.rotate(Arrays.asList(arr), -d); 
		    
		    for(int i=0;i<n;i++)
		    System.out.print(arr[i]+" ");
		    
		    System.out.println();
		    
		}
	}
}
