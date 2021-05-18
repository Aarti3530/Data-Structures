class Solution{
    
    String roundToNearest(String N)
    {
        
        int rem = Character.getNumericValue(N.charAt(N.length()-1));
        int []arr = new int[N.length()];
        for(int i=0;i<N.length();i++){
            arr[i] = Character.getNumericValue(N.charAt(i));
        }
        
        if(rem == 0)
        return N;
        
        else if (rem > 5){
            if(N.length()==1){
            return "10";}
            else{
            
            arr[arr.length-1] = 0;
            for(int i = arr.length-2;i>=0;i--){
               int t = arr[i]+1;
               arr[i] = arr[i]+1;
                if(t<10){
                   break;
               }
             }
          }
        }
        
         else {
            if(N.length()==1)
            return "0";
            else{
            N = N.substring(0,N.length()-1);
            N = N+0;
            return N;
            }
        }
         N = "";
           for(int i=0;i<arr.length;i++){
               if(arr[i]==10 && i!=0)
               arr[i]=0;
               N = N+arr[i];
           }
           return N;    
    }  
}
