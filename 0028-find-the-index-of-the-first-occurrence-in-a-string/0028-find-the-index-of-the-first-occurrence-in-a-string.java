class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0;
        int j = needle.length()-1;
        int answer = -1;
        while(j<haystack.length())
        {
            String temp = haystack.substring(i,j+1);
            if(temp.equals(needle))
            {
                answer = i;
                break;
            }
            i++;
            j++;
        }
        return answer;
    }
}