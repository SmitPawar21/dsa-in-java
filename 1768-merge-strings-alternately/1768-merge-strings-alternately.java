class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        int j=0;
        String answer = "";
        int len = word1.length() + word2.length();
        while(len!=0)
        {
            if(i>=word1.length() || j>=word2.length())
            {
                break;
            }
            answer = answer + word1.charAt(i);
            answer = answer + word2.charAt(j);
            i++;
            j++;
            len = len - 2;
        }
        if(i>=word1.length())
        {
            while(len!=0)
            {
                answer = answer + word2.charAt(j);
                j++;
                len--;
            }
        }
        else if(j>=word2.length())
        {
            while(len!=0)
            {
                answer = answer + word1.charAt(i);
                i++;
                len--;
            }
        }
        return answer;
    }
}