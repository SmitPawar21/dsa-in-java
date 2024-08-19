class Solution {
    public boolean isAnagram(String s, String t) {
        boolean result = true;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        if(s.length() != t.length())
        {
            return false;
        }

        for(int i=0; i<s.length(); i++)
        {
            if(map1.containsKey(s.charAt(i)))
            {
                map1.put(s.charAt(i), map1.get(s.charAt(i)) + 1);
            }
            else
            {
                map1.put(s.charAt(i), 1);
            }
        }

        for(int i=0; i<t.length(); i++)
        {
            if(map2.containsKey(t.charAt(i)))
            {
                map2.put(t.charAt(i), map2.get(t.charAt(i)) + 1);
            }
            else
            {
                map2.put(t.charAt(i), 1);
            }
        }

        // for(int i=0; i<s.length(); i++)
        // {
        //     char ch = s.charAt(i);
        //     // if(map1.containsKey(ch) && map2.containsKey(ch))
        //     // {
        //         if(map1.get(ch) != map2.get(ch))
        //         {
        //             result = false;
        //             break;
        //         }
        //     // }
        //     // else
        //     // {
        //     //     result = false;
        //     //     break;
        //     // }
        // }

        for(char ch : map1.keySet())
        {
            if(!map1.get(ch).equals(map2.get(ch)))
            {
                result = false;
                break;
            }
        }

        return result;
    }
}