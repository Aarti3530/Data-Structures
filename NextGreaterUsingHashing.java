class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        for(int i=0;i<nums2.length;i++){
            h.put(nums2[i],-1);
            int p = i+1;
            while(p<nums2.length){
                if(nums2[i] < nums2[p]){
                    h.put(nums2[i],nums2[p]);
                        break;
                }
                p++;
            }
        }
        for(int i=0;i<nums1.length;i++){
            if(h.containsKey(nums1[i]))
                nums1[i] = h.get(nums1[i]);
        }
        return nums1;
    }
}
