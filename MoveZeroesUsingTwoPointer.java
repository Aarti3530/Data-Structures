class Solution {
    public void moveZeroes(int[] nums) {
        int p = 0,q = 1;
        while(q<nums.length){
            if(nums[p] != 0) p++;
            if(nums[q] != 0 && nums[p] == 0){
                nums[p] = nums[q];
                nums[q] = 0;
                p++;
            }
            q++;
        }
    }
}
