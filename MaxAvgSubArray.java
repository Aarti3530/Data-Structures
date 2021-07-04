class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double max = 0,ans=0;
        for(int i=0;i<nums.length;i++){
            if(i<k){
                max += nums[i];
                ans = max;
            }else{
                max = max + (nums[i] - nums[i-k]);
                if(max > ans)
                    ans = max;
                
            }
        }
        
        return ans/k;
    }
}
