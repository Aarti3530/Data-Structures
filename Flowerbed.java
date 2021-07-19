class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length == 1){
            if(n == 0) return true;
            if(flowerbed[0] == 0 && n==1 || flowerbed[0] == 1 && n==0) return  true;
            return false;
        }
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i] == 1) continue;
            else{
                if(i+1<flowerbed.length){
                if(i == 0 && flowerbed[i]==0 && flowerbed[i+1]==0){
                  n--;  
                    flowerbed[i]=1;
                }
                }
                if(i-1>=0 && i+1<flowerbed.length){
                    if(flowerbed[i-1] == 0 && flowerbed[i+1]==0){
                        n--;
                        flowerbed[i] = 1;
                    }
                }
                if(i-1>=0){
                if(i == flowerbed.length-1 &&flowerbed[i]==0 && flowerbed[i-1]==0){
                  n--;  
                    flowerbed[i]=1;
                }
                }
            }
        }
        if(n<=0) return true;
        return false;
    }
}

//https://leetcode.com/problems/can-place-flowers/
