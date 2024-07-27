class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int ans = 0;
        for(int i=0; i<colors.length; i++)
        {
            if(i==colors.length-2)
            {
                if(colors[i]==colors[0] && colors[i+1]!=colors[i])
                {
                    ans++;
                }
                continue;
            }
            
            if(i==colors.length-1)
            {
                if(colors[i]==colors[1] && colors[0]!=colors[i])
                {
                    ans++;
                }
                continue;
            }
            if(colors[i]==colors[i+2] && colors[i+1]!=colors[i])
            {
                ans++;
            }
        }
        return ans;
    }
}