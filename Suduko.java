import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int k = 5;
		for(int i=0;i<k;i++){
		    for(int j=0;j<k;j++){
		        System.out.print(((k+1)/2+i+j)%k+1);
		    }
		    System.out.println();
		}
	}
}
