class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] arr = new int[2];
        //int c=0;
        HashMap<Integer,Integer> l1 = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            l1.put(nums[i],i);
            //l2.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
          int t = target - nums[i];
          if(l1.containsKey(t) && l1.get(t)!=i){
             return new int []{i,l1.get(t)};
          }
        }
        return arr;
        
    }
}
