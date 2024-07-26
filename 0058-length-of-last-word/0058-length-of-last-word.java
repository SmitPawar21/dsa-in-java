class Solution {
    public int lengthOfLastWord(String s) {
        String lastWord = "";
        int t = 0;
        for(int i=s.length()-1; i>=0; i--)
        {
            if(s.charAt(i) == ' ')
            {
                if(t == 1)
                {
                    break;
                }
                continue; 
            }
            else if(s.charAt(i) != ' ')
            {
                t = 1;
                lastWord = lastWord + s.charAt(i);
            }
        }
        return lastWord.length();
    }
}