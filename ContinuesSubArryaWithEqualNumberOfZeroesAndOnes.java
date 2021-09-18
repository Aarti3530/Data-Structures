class Solution {
    public int findMaxLength(int[] arr) {
        int sum = 0;
       int max = 0;
       Map<Integer,Integer> h = new HashMap<Integer,Integer>();
       h.put(0,-1);
       for(int i=0;i<arr.length;i++){
           if(arr[i] == 0)sum += -1;
           else sum += 1;
           if(h.containsKey(sum)){
               int index = h.get(sum);
               max = Math.max(max,i-index);
           }else{
               h.put(sum,i);
           }
       }
       return max;
    }
}


// Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.
