

class Solution
{
    String secFrequent(String arr[], int N)
    {
        HashMap<String,Integer> h = new HashMap<String,Integer>(N);
        String s="";
        int []ar = new int[N];
        int p=0;
        for(int i=0;i<N;i++){
            String temp = (String)arr[i];
            if(h.containsKey(temp)){
                h.put(temp,h.get(temp)+1);
            }
            else{
                h.put(temp,1);
            }
        }
        
        for(Map.Entry<String,Integer> entry : h.entrySet()){
            ar[p++] = entry.getValue();
        }
        Arrays.sort(ar);
        
        int value = ar[N-2];
        
        for(Map.Entry<String,Integer> entry : h.entrySet()){
            if(value == entry.getValue()){
                s = entry.getKey();
                return s;
            }
        }
        
        return s;
        
    }
}
