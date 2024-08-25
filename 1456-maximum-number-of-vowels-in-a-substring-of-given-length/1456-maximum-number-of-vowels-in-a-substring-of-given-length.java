class Solution {
    public int maxVowels(String s, int k) { 
        int start=0, end=0;
        int count=0;
        int maxCount=0;
        String temp = "";
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if((end - start) == k)
            {
                if(count == k)
                {
                    return count;
                }
                
                char c = temp.charAt(0);
                temp = temp.substring(1,temp.length());
                start++;
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                {
                    count = count - 1;
                }
            }
            temp = temp + s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                count++;
            }
            if(count > maxCount)
                {
                    maxCount = count;
                }
            end++;
        }
        return maxCount;
    }
}