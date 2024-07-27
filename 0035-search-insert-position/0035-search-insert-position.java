class Solution {
    public static int binarySearch(int[] nums, int target, int s, int e)
    {
        if(s>e)
        {
            return -1;
        }
        int mid = s + (e-s)/2;
        if(nums[mid] == target)
        {
            return mid;
        }
        if(nums[mid] < target)
        {
            s = mid + 1;
        }
        else if(nums[mid] > target)
        {
            e = mid - 1;
        }
        return binarySearch(nums,target,s,e);
    }
    public static int insertNum(int[] nums, int target, int i)
    {
        if(i==nums.length)
        {
            return i;
        }
        if(target < nums[i])
        {
            return i;
        }
        i++;
        return insertNum(nums,target,i);
    }
    public int searchInsert(int[] nums, int target) {
        int ans = binarySearch(nums,target,0,nums.length-1);
        if(ans != -1)
        {
            return ans;
        }
        ans = insertNum(nums,target,0);
        return ans;
        
        }
    }
