import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().toUpperCase();
		s = s.replaceAll(" ","");
		char []temp = s.toCharArray();
		Arrays.sort(temp);
		s = String.valueOf(temp);
		for(int i=65;i<=90;i++){
		   char ch = (char)i;
		   String t = Character.toString(ch);
		   if(s.contains(t)){
		       continue;
		   }else{
		       System.out.print(ch+" ");
		   }
		}
	}
}
