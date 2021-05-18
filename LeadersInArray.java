class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> a = new ArrayList<Integer>(n);
        a.add(arr[n-1]);
        int max = arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(max<=arr[i]){
            max = arr[i];
            a.add(max);
            }
        }
        Collections.reverse(a);
        return a;
    }
}
