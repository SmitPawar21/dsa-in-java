class Solution {
    public String reverseWords(String s) {
        String temp = "";
        String answer = "";
        Stack<String> st = new Stack<>();
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)==' ')
            {
                if(temp.equals(""))
                {
                    continue;
                }
                st.push(temp);
                temp = "";
            }
            else if(i == s.length()-1)
            {
                if(s.charAt(i) != ' ')
                {
                    temp = temp + s.charAt(i);
                    st.push(temp);
                }
            }

            else
            {
                temp = temp + s.charAt(i);
            }
        }
        while(!st.empty())
        {
            answer = answer + st.pop();
            answer = answer + " ";
        }
        answer = answer.substring(0, answer.length()-1);
        return answer;
    }
}