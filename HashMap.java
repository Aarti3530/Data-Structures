import java.util.*;
public class Main
{
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  HashMap<Character,Integer> h = new HashMap<Character,Integer>();
	  char []arr =  sc.next().toCharArray();
	  for(int i=0;i<arr.length;i++){
	      if(h.containsKey(arr[i])){
	          h.put(arr[i],h.get(arr[i])+1);
	      }
	      else{
	          h.put(arr[i],1);
	      }
	  }
	  for (Map.Entry<Character, Integer> entry : h.entrySet())
        {
            //if(entry.getValue()==1)
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
	  
	}
}
