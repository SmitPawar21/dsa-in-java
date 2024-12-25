class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        int mid = (start + end)/2;

        char min = '{';

        while(start <= end) {
            if(letters[mid] <= target) {
                start = mid + 1;
            }
            else if(letters[mid] > target) {
                if(letters[mid] < min) {
                    min = letters[mid];
                }
                end = mid - 1;
            }

            mid = (start + end)/2;
        }

        if(min == '{') {
            return letters[0];
        }

        return min;
    }
}