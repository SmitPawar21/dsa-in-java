class Solution {
    public double minimumAverage(int[] nums) {
        for(int i=0; i<nums.length; i++)
        {
            for(int j=i; j<nums.length; j++)
            {
                if(i==j)
                {
                    continue;
                }
                if(nums[j] < nums[i])
                {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        double[] averages = new double[nums.length/2];
        int start = 0;
        int end = nums.length - 1;
        int k=nums.length;
        int m = 0;
        while(k>0)
        {
            double minElement = nums[start];
            double maxElement = nums[end];
            averages[m++] = (minElement + maxElement)/2;
            k = k - 2;
            start ++;
            end--;
        }
        double answer = averages[0];
        for(int i=0; i<averages.length; i++)
        {
            if(averages[i]<answer)
            {
                answer = averages[i]; 
            }
        }
        return answer;
    }
}