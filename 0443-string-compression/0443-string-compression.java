class Solution {
    public int compress(char[] chars) {
        String temp = "";
        int count = 1;
        if(chars.length == 1)
        {
            return chars.length;
        }
        for(int i=1; i<chars.length; i++)
        {
            if(chars[i] == chars[i-1])
            {
                count++;
                if(i==chars.length-1)
                {
                    temp = temp + chars[i];
                    temp = temp + String.valueOf(count);
                }
            }
            else if(chars[i] != chars[i-1])
            {
                temp = temp + chars[i-1];
                if(count != 1)
                {
                    temp = temp + String.valueOf(count);
                }
                count = 1;
                if(i==chars.length-1)
                {
                    temp = temp + chars[i];
                }
            }
        }
        for(int i=0; i<temp.length(); i++)
        {
            chars[i] = temp.charAt(i);
        }
        return temp.length();
    }
}