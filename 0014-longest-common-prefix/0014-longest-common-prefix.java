class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = strs[0].length();
        String small = strs[0];
        for(int i=0; i<strs.length; i++)
        {
            if(strs[i].length() < min)
            {
                small = strs[i];
                min = i;
            }
        }
        String answer = "";
        int k = 0;
        int t = 0;
        for(int i=0; i<small.length(); i++)
        {
            char check = small.charAt(i);
            for(int j=0; j<strs.length; j++)
            {
                if(strs[j].charAt(i) != check)
                {
                    t = 1;
                    break;
                }
            }
            if(t==0)
            {
                answer = answer + check;
            }
            if(t==1)
            {
                break;
            }
        }
        return answer;
    }
}