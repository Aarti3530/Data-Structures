class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        for(int i=1;i<=numRows;i++){
            int c = 1;
            ArrayList<Integer> l1 = new ArrayList<Integer>();
            for(int j=1;j<=i;j++){
                l1.add(c);
                c = c*(i-j)/j;
            }
            l.add(l1);
        }
        return l;
    }
}
