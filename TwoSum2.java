class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] arr = new int[2];
        
        HashMap<Integer,Integer> l1 = new HashMap<Integer,Integer>();
        
        for(int i=0;i<nums.length;i++){
            l1.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
          int t = target - nums[i];
          if(l1.containsKey(t) && l1.get(t)!=i){
             arr[0] = i+1;
             arr[1] = l1.get(t)+1;
              return arr;
          }
        }
        return arr;
    }
}
