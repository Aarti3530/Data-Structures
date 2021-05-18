class Sol
{
    int[] count (String s)
    {
        int arr[] = new int [4];
        for(int i=0;i<s.length();i++){
            
            char ch = s.charAt(i);
            
            if(ch>='A' && ch<='Z')
            arr[0] = arr[0]+1;
            
            else if(ch>='a' && ch<='z')
            arr[1] = arr[1]+1;
            
            else if(ch>='0' && ch<='9')
            arr[2] = arr[2]+1;
            
            else
            arr[3] = arr[3]+1;
        }
        return arr;
    }
}
