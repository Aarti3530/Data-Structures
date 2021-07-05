class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> l = new ArrayList<Integer>();
        for(int i=1;i<=rowIndex+1;i++){
            long c = 1;
            if(i==rowIndex+1){
            for(int j=1;j<=i;j++){
                l.add((int)c);
                c = c*(i-j)/j;
               }
            }
        }
        return l;
    }
}
