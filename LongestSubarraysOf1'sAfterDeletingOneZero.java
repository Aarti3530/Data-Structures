class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0,c = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                c = 0;
                int j=i,n=0;
                while(c < 2 && j < nums.length){
                    if(nums[j] == 0) c++;
                    else n++;
                    j++;
                }
                if(n == nums.length) return n-1;
                if(max < n) max = n;
            }
        }
        return max;
    }
}


//Given a binary array nums, you should delete one element from it.Return the size of the longest non-empty subarray containing only 1's in the resulting array.Return 0 if there is no such subarray.

// https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/
