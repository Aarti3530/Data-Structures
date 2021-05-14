
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        
       Scanner sc = new Scanner(System.in);  
       int n = sc.nextInt();
       int []arr = new int[n];
       HashMap<Integer,Integer> h = new HashMap<Integer,Integer>(n);

       for(int i=0;i<n;i++)
       arr[i] = sc.nextInt();

       for(int i=0;i<arr.length;i++){
           if(h.containsKey(arr[i])){
               h.put(arr[i],h.get(arr[i])+1);
           }
           else{
               h.put(arr[i],1);
           }
       }
       int maxValueInMap=(Collections.max(h.values()));
       int key = 0; 
       for (Map.Entry<Integer, Integer> entry : h.entrySet()) { 
           if(entry.getValue() == maxValueInMap)
             key = entry.getKey();
        }
       for (Map.Entry<Integer, Integer> entry : h.entrySet()) { 
            if (entry.getValue()==maxValueInMap 
            && entry.getKey() < key) {
             key = entry.getKey();
            }
        }
        System.out.println(key);
     }
}
