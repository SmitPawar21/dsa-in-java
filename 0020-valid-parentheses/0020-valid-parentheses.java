class Solution {
    public boolean isValid(String s) {
        boolean result = true;
        HashMap<Character, Character> map = new HashMap<>();
        Stack<Character> brackets = new Stack<>();

        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(map.containsKey(ch))
            {
                if(!brackets.isEmpty() && map.get(ch).equals(brackets.peek()))
                {
                    brackets.pop();
                }
                else
                {
                    result = false;
                }
            }
            else
            {
                brackets.push(ch);
            }
        }
        if(!brackets.isEmpty())
        {
            result = false;
        }
        return result;
    }
}