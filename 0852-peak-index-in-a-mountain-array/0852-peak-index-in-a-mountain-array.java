class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        int mid = (start + end)/2;

        int answer = 100000;

        while(start <= end) {
            if(arr[mid] > arr[mid+1]) {
                if(mid < answer) {
                    answer = mid;
                }
                end = mid - 1;
            }

            else {
                start = mid + 1;
            }

            mid = (start + end)/2;
        }

        return answer;
    }
}