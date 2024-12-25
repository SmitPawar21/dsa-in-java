class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        int mid = (start + end)/2;
        int min = 100000;

        while(start <= end) {
            if(nums[mid] == target) {
                if(mid < min) {
                    min = mid;
                }
                end = mid - 1;
            }

            else if(nums[mid] < target) {
                start = mid + 1;
            }

            else if(nums[mid] > target) {
                end = mid - 1;
            }

            mid = (start + end)/2;
        }

        // for last position

        start = 0;
        end = nums.length - 1;

        mid = (start + end)/2;
        int max = 0;

        while(start <= end) {
            if(nums[mid] == target) {
                if(mid > max) {
                    max = mid;
                }
                start = mid + 1;
            }

            else if(nums[mid] < target) {
                start = mid + 1;
            }

            else if(nums[mid] > target) {
                end = mid - 1;
            }

            mid = (start + end)/2;
        }

        int[] answer = new int[2];
        if(min == 100000 && max == 0) {
            answer[0] = -1;
            answer[1] = -1;
        }

        else {
            answer[0] = min;
            answer[1] = max;
        }

        return answer;

    }
}