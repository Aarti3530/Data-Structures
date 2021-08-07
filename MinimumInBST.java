class Tree
{
    //Function to find the minimum element in the given BST.
    int minValue(Node node)
    {
        int min = Integer.MAX_VALUE;
        while(node!=null){
            if(node.data < min)
            min = node.data;
            
            node = node.left;
        }
        return min;
    }
}
