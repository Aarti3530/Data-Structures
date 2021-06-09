class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<Integer>();
        Stack<Integer> st = new Stack<Integer>();
        for(int i=0;i<students.length;i++){
            q.offer(students[i]);
        }
        for(int i=sandwiches.length-1;i>=0;i--){
            st.push(sandwiches[i]);
        }
        int c = 0;
        while(!st.isEmpty()){
            if(q.peek() == st.peek()){
                q.poll();
                st.pop();
                c = 0;
            }
            else{
                int p = q.poll();
                q.offer(p);
                c++; 
            }
            if(c == q.size())
                    return q.size();
        }
        //System.out.println(q);
        return 0;
    }
}
