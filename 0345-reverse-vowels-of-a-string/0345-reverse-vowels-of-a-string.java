class Solution {
    public boolean isVowel(char ch)
    {
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            return true;
        }
        else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
        int start = 0;
        int end = s.length()-1;
        StringBuilder str = new StringBuilder(s);

        while(start < end)
        {
            char chStart = str.charAt(start);
            char chEnd = str.charAt(end);

            if(isVowel(chStart) && isVowel(chEnd))
            {
                str.setCharAt(start, chEnd);
                str.setCharAt(end, chStart);
                start++;
                end--;
                continue;
            }
            else if(isVowel(chStart))
            {
                end--;
                continue;
            }
            else if(isVowel(chEnd))
            {
                start++;
                continue;
            }
            start++;
            end--;
        }
        return str.toString();
    }
}