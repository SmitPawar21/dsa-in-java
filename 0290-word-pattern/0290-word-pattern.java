class Solution {
    public boolean wordPattern(String pattern, String s) {
        boolean result = true;
        String[] str = new String[pattern.length()];
        String temp = "";
        int k = 0;
        for(int i=0; i<s.length(); i++)
        {
            if(k >= pattern.length())
            {
                 return false;
            }
            else if((s.charAt(i) == ' '))
            {
                str[k++] = temp;
                temp = "";
            }
            else
            {
                temp = temp + s.charAt(i);
                if(i == s.length()-1)
                {
                    
                    str[k++] = temp;
                    temp="";
                }
            }
        } 
        
        if(k != pattern.length())
        {
            return false;
        }
        
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        for(int i=0; i<pattern.length(); i++)
        {
            if(map1.containsKey(pattern.charAt(i)))
            {
                if(!map1.get(pattern.charAt(i)).equals(str[i]))
                {
                    result = false;
                }
            }
            else
            {
                map1.put(pattern.charAt(i), str[i]);
            }
        }
        
        for(int i=0; i<str.length; i++)
        {
            if(map2.containsKey(str[i]))
            {
                if(map2.get(str[i]) != pattern.charAt(i))
                {
                    result = false;
                }
            }
            else
            {
                map2.put(str[i], pattern.charAt(i));
            }
        }
        return result;
    }
}