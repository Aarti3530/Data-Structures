class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> s = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++) s.add(nums[i]);
        int a=Integer.MIN_VALUE,b=Integer.MIN_VALUE,c=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
           if(nums[i]>a){
               c = b;
               b = a;
               a = nums[i];
           }else if(nums[i]>b && nums[i]<a){
               c = b;
               b = nums[i];
           }else if(nums[i]>c && nums[i]<b){
               c = nums[i];
           }
        }
        if(s.size()<3){
            if(a>b)
                return a;
            return b;
        }return c;
        
    }
}
