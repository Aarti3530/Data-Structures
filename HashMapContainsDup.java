class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(h.containsKey(nums[i])){
                int t = h.get(nums[i]);
                    if(Math.abs(i-t) <= k)
                        return true;
            }
                h.put(nums[i],i);
        }
        
        return false;
    }
}
