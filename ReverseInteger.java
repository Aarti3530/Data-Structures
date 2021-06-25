class Solution {
    public int reverse(int x) {
        if(x == 0)
            return 0;
        String s = "";
        if(x>0){
        while(x > 0){
            s = s + x%10;
            x = x/10;
        }
            try{
            x = Integer.parseInt(s);
            }catch(Exception e){
                return 0;
            }
        }
        else{
          x = (-1)*x;
            while(x > 0){
            s = s + x%10;
            x = x/10;
            }
            try{
            x = (-1)*(Integer.parseInt(s));
            }catch(Exception e){
                return 0;
            }
        }
        return x;
        
    }
}
