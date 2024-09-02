class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if(nums.length == 0)
        {
            return list;
        }
        if(nums.length == 1)
        {
            list.add(String.valueOf(nums[0]));
            return list;
        }
        int start = nums[0];
        String end = "";
        for(int i=0; i<nums.length; i++)
        {
            if(i == nums.length - 1)
            {
                if(nums[i]-1 == nums[i-1])
                {
                    list.add(String.valueOf(start) + "->" + String.valueOf(nums[i]));
                    continue;
                }
                list.add(String.valueOf(nums[i]));
            }
            else if(nums[i+1] == nums[i]+1)
            {
                end = String.valueOf( nums[i+1] );
            }
            else{
                if(end.equals(""))
                {
                    list.add(String.valueOf(start));
                    start = nums[i+1];
                    continue;
                }
                String temp = String.valueOf(start) + "->" + end;
                list.add(temp); 
                start = nums[i+1];
                end = "";
            }
        }
        return list;
    }
}