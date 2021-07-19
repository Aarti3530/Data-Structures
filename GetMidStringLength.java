import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc =  new Scanner(System.in);
	    String s = sc.nextLine();
	    System.out.println(s+" ");
	    //int c = getMid(s);
		System.out.println(c);
	}
	public static int getMid(String s){
	    String []t = s.split(" ");
	    if(t.length%2!=0){
	        int size = t[t.length/2].length();
	        return size;
	    }else{
	        if(t[t.length/2].length()>t[t.length/2-1].length())
	        return t[t.length/2].length();
	        else
	        return t[t.length/2-1].length();
	    }
	}
}
