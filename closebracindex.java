class Sol
{
    int closing (String s, int pos)
    {
    	int n = s.length ();
    
    	int cnt = 0;
    	for (int i = pos; i < n; ++i)
    	{
    		if (s.charAt(i) == '[') cnt++;
    		else if (s.charAt(i) == ']') cnt--;
    		if (cnt == 0)
    			return i;
    	}
    	return -1;
    }

}
