import java.lang.Math;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean result = false;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++)
        {
            if(map.containsKey(nums[i]))
            {
                int temp = Math.abs(map.get(nums[i]) - i);
                if(temp <= k)
                {
                    result = true;
                    break;
                }
                else
                {
                    map.put(nums[i], i);
                }
            }
            else
            {
                map.put(nums[i], i);
            }
        }
        return result;
    }
}