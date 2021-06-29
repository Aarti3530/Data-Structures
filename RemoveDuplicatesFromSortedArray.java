class Solution {
    public int removeDuplicates(int[] nums) {
        int c = 1,count=1;
        int [] arr = new int[nums.length];
        arr[0] = nums[0];
        int j = 1;
        for(int i=1;i<nums.length;i++){
            
            if(arr[j-1] == nums[i] && c < 2){
                arr[j++] = nums[i];
                count++;
                c++;
            }
            
            else if(arr[j-1] != nums[i]){
                arr[j++] = nums[i];
                count++;
                c = 1;
            } 
            
        }
        for(int i=0;i<count;i++){
            nums[i] = arr[i];
        }
        return count;
    }
}
