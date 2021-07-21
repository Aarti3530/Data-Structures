class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        int []brr = new int[n];
        
        for(int i=0;i<n;i++){
            brr[arr[i]]++;
        }
        
        for(int i=0;i<n;i++){
            if(brr[i]> 1){
                l.add(i);
            }
        }
        
        if(l.size() >=1)
        return l;
        
        else
            l.add(-1);
        return l;
    }
}
