class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res= new HashSet<>();
        
        if(nums.length == 0){
            return new ArrayList<>(res);
        }
        
        Arrays.sort(nums);
        int len=nums.length;
        
       
        for(int i=0;i<len-2;i++){
            int cur = nums[i];
            int l = i+1;
            int r = len-1;
            while(l<r){
                
                int sum=cur+nums[l]+nums[r];
                if(sum<0){
                    l++;
                }
                else if(sum>0){
                    r--;
                }
                else if(sum == 0){
                    res.add(Arrays.asList(cur,nums[l++],nums[r--]));
                }
               
            }
        }
        
        return new ArrayList<>(res);
    }
}
