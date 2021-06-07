class Solution {
    public int maxSubArray(int[] nums) {
        int num = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            if(sum > num)
                num = sum;
            if(sum < 0)
                sum =0;
        }
        return num;
    }
}
