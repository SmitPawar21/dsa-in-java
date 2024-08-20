class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] answer = new int[2];

        int left = 0;
        int right = numbers.length - 1;
        while(left < right)
        {
            int sum = numbers[left] + numbers[right];
            if(sum == target)
            {
                answer[0] = left+1;
                answer[1] = right+1;
                break;
            }
            else if(sum < target)
            {
                left++;
            }
            else if(sum > target)
            {
                right--;
            }
        }
        return answer;
    }
}