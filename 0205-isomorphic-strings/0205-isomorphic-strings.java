class Solution {
    public boolean isIsomorphic(String s, String t) {
        boolean result = true;
        HashMap<Character, Character> mapS = new HashMap<>();                     HashMap<Character, Character> mapT = new HashMap<>();

        for(int i=0; i<s.length(); i++)
        {
            if(mapS.containsKey(s.charAt(i)))
            {
                if(mapS.get(s.charAt(i)) != t.charAt(i))
                {
                    result = false;
                    break;
                }
            }
            else
            {
                mapS.put(s.charAt(i), t.charAt(i));
            }
        }
        for(int i=0; i<s.length(); i++)
        {
            if(mapT.containsKey(t.charAt(i)))
            {
                if(mapT.get(t.charAt(i)) != s.charAt(i))
                {
                    result = false;
                    break;
                }
            }
            else
            {
                mapT.put(t.charAt(i), s.charAt(i));
            }
        }
        return result;
    }
}