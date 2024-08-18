class Solution {
    public int sqr(int n)
    {
        int ans = 0;
        while(n!=0)
        {
            int mod = n%10;
            ans = ans + (mod*mod);
            n = n/10;
        }
        return ans;
    }
    public boolean isHappy(int n) {
        boolean result = true;
        HashMap<Integer, Integer> map = new HashMap<>();

        int check = 0;
        int temp = n;
        while(check == 0)
        {
            temp = sqr(temp);
            if(map.containsKey(temp))
            {
                if(temp != 1)
                {
                    result = false;
                    check = 1;
                }
                else
                {
                    result = true;
                    check = 1;
                }
            }
            map.put(temp, 1);
        }
        return result;
    }
}