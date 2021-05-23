/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class MyComparator implements Comparator<Integer>{
    Map<Integer,Integer> t;
    MyComparator(Map<Integer,Integer> t){
       this.t = t; 
    }
    public int compare(Integer i,Integer j){
        if(t.get(i) > t.get(j))
        return -1;
        else
        return 1;
    }
}

class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int c = sc.nextInt();
	    while(c--!=0){
	        int n = sc.nextInt();
		    HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
		    MyComparator com = new MyComparator(mp);
		    TreeMap<Integer,Integer> tree = new TreeMap<Integer,Integer>(com);
		    for(int i=0;i<n;i++){
		        int t = sc.nextInt();
		        if(mp.containsKey(t)){
		            mp.put(t,mp.get(t)+1);
		        }
		        else
		        mp.put(t,1);
		    }
		    tree.putAll(mp);
		    for(Map.Entry<Integer,Integer> entry : tree.entrySet()){
		        if(entry.getValue() == 1)
		        System.out.print(entry.getKey()+" ");
		        else
		        for(int i=0;i<entry.getValue();i++){
		            System.out.print(entry.getKey()+" ");
		        }
		    }
		    System.out.println();
	    }
	}
}
