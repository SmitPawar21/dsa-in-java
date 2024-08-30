class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
        {
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();

        //adding unique numbers in set
        for(int i=0; i<nums.length; i++)
        {
            set.add(nums[i]);
        }

        //finding the longest sequence
        int max = 1;
        for(int i: set)
        {
            if(!set.contains(i - 1))
            {
                int count = 1;
                int temp = i;
                while(set.contains(temp+1))
                {
                    count++;
                    temp++;
                }
                if(count > max)
                {
                    max = count;
                }
            }
        }
        return max;
    }
}