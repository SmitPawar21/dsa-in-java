class Solution {
    public static int recSqrt(int x, int s, int e, int ans)
    {
        if(s>e)
        {
            return ans;
        }
        int mid = s + (e-s)/2;
        if((long)mid*(long)mid > (long) x)
        {
            e = mid-1;
            ans = e;
        }
        else if((long)mid*(long)mid < (long)x)
        {
            s = mid+1;
            ans = mid;
        }
        else if((long)mid*(long)mid==(long)x)
        {
            ans = mid;
            return ans;
        }
        return recSqrt(x,s,e,ans);
    }
    public int mySqrt(int x) {
        int s = 0;
        int e = x;
        int mid = s + (e-s)/2;
        int ans = recSqrt(x,s,e,0);
        return ans;
    }
}