class Solution {
    public int[] plusOne(int[] digits) {
        int t = digits[digits.length-1] + 1;
        ArrayList<Integer> l = new ArrayList<Integer>();
        if(t > 9){
            int c = digits.length-2;
            int carry = t/10;
            l.add(t%10);
            for(int i = digits.length-2;i>=0;i--,c--){
                int temp = digits[i] + carry;
                if(temp > 9){
                    l.add(temp%10);
                    carry = temp/10;
                }
                else{
                    l.add(temp);
                    carry = 0;
                    break;
                }
            }
            if(c > 0){
                for(int i=c-1;i>=0;i--){
                    l.add(digits[i]);
                }
            }
            if(carry > 0)
            l.add(carry);
            Collections.reverse(l);
            int [] arr = new int[l.size()];
            for(int i=0;i<l.size();i++){
                arr[i] = l.get(i);
            }
            return arr;
        }
        else{
            digits[digits.length-1] = t;
            return digits;
        }
    }
}
