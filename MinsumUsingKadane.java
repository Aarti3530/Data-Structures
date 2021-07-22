public static int sum(int [] arr,int s,int n){
        int max = Integer.MAX_VALUE;
        int sum = 0;
        for(int i=s;i<n;i++){
            sum = sum + arr[i];
            if(sum < max)
            max = sum;
            if(sum > 0)
            sum = 0;
        }
        return max;
    }
