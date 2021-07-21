class Solve {
    int[] findTwoElement(int arr[], int n) {
        boolean [] brr = new boolean[n];
        int [] res = new int[2];
        int c = 0;
        for(int i=0;i<n;i++){
            if(brr[arr[i]-1] == false){
                brr[arr[i]-1] = true;
            }else{
                res[c++] = arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(brr[i]==false)
            res[c++] = i+1;
        }
        return res;
    }
}
