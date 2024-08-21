class Solution {
    public int sum(int[] nums, int m, int n)
    {
        int count=0;
        for(int i=m ; i<n; i++)
        {
            count = count + nums[i];
        }
        return count;
    }
    public int pivotIndex(int[] nums) {
        int count = 0;
        int answer = -1;
        for(int i=0; i<nums.length; i++)
        {
            if(i==nums.length-1)
            {
                if(count == 0)
                {
                    answer = i;
                    break;
                }
            }
            else if(count == sum(nums, i+1, nums.length))
            {
                answer = i;
                break;
            }
            count = count + nums[i];         
        }
        return answer;
    }
}