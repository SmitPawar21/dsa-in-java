class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int s=0, e=0;
        double temp = 0;
        double avg = Integer.MIN_VALUE;

        if(nums.length == 1)
        {
            return nums[0];
        }

        for(int i=0; i<nums.length; i++)
        {  
            temp = temp + nums[i];
            if((e-s+1) == k)
            {
                if(temp > avg)
                {
                    avg = temp;
                }
                temp = temp - nums[s];
                s++;
            }
            e++;
        }

        return (avg/k);
    }
}