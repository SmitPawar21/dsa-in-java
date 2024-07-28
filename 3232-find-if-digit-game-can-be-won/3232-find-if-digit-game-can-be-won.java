class Solution {
    public boolean canAliceWin(int[] nums) {
        int sumOfsingle = 0;
        int sumOfdouble = 0;
        boolean answer = false;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] < 10)
            {
                sumOfsingle += nums[i];
            }
            else 
            {
                sumOfdouble += nums[i];
            }
        }
        
        if(sumOfsingle > sumOfdouble)
        {
            answer = true;
        }
        else if(sumOfsingle < sumOfdouble)
        {
            answer = true;
        }
        return answer;
    }
}