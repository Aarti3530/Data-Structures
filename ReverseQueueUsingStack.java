// { Driver Code Starts
//Initial Template for Java

import java.util.*;
class ModifyQueue{
    public static void main(String[] args){
        
        //Taking input using class Scanner
        Scanner sc=new Scanner(System.in);
        
        //Taking total number of testcases
        int t=sc.nextInt();
        
        while(t-->0){
            //Taking count of total number of elements
            int n=sc.nextInt();
            
            //Taking count of total elements
            //that need to be reversed
            int k=sc.nextInt();
            
            //Creating a Queue
            Queue<Integer> q=new LinkedList<>();
            
            //adding all the elements to the Queue
            while(n-->0){
                q.add((int)sc.nextInt());
            }
            
            //Creating an object of class GfG
            GfG g=new GfG();
            
            //calling modifyQueue of class GfG
            //and passing Queue and k as arguments
            //and storing the reuslt in a new Queue
            Queue<Integer> ans=g.modifyQueue(q,k);
            
            //Printing all the elements from the
            //new Queue and polling them out
            while(!ans.isEmpty()){
                int a=ans.peek();
                ans.poll();
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends

class GfG
{
    //Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k)
    {
      Stack<Integer> st = new Stack<Integer>();
      Queue<Integer> q1 = new LinkedList<>();
      Iterator<Integer> itr = q.iterator();
      int i=0;
      while(itr.hasNext()){
          if(i<k){
              st.push(itr.next());
              i++;
          }
          else break;
      }
      
      while(!st.isEmpty()){
          q1.offer(st.peek());
          st.pop();
      }
      i=0;
      while(itr.hasNext()){
          if(i>=k){
              q1.offer(itr.next());
          }
          else{
              i++;
          continue;
          }
      }
      return q1;
      
    }
}
