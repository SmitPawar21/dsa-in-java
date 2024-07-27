class Solution {
    public static String swap(String s,int i)
    {
        String ans = "";
        for(int x=0; x<s.length(); x++)
        {
            if(x==i)
            {
                ans = ans + s.charAt(x+1);
                continue;
            }
            else if(x==i+1)
            {
                ans = ans + s.charAt(x-1);
                continue;
            }
            ans = ans + s.charAt(x);
        }
        return ans;
    }
    public String getSmallestString(String s) {
        String ans = s;
        for(int i=0; i<s.length()-1; i++)
        {
            int n = s.charAt(i) - 0;
            int m = s.charAt(i+1) - 0;
            if(m<n && ((m%2==0 && n%2==0)||(m%2!=0 && n%2!=0)))
            {
                ans = swap(s,i);
                break;
            }
        }
        return ans;
    }
}