class Solution {
    int total=0;
    public int sumNumbers(TreeNode root) {
        Solution s = new Solution();
        int t = s.sum(root,0);
        return t;
    }
    public int sum(TreeNode root,int add){
        add = add*10 + root.val;
        if(root.left!=null) sum(root.left,add);
        if(root.right!=null) sum(root.right,add);
        if(root.right == null && root.left == null){
            total+=add;
        }
        return total;
    }
}
