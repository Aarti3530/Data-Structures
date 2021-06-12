class Solution {
    public static int digitSum(int num){
        int sum = 0;
        while(num > 0){
            sum = sum + (num%10)*(num%10);
            num = num/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int temp = n;
        int c = 0;
        while(temp != 1){
            temp = digitSum(temp);
            c++;
            if(c >= 100)
                return false;
        }
        if(temp == 1)
            return true;
        else 
            return false;
    }
}
