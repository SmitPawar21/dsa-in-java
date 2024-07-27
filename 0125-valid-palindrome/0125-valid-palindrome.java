class Solution {
    public static boolean checkPalin(String answer)
    {
        String rev = "";
        for(int i=answer.length()-1; i>=0; i--)
        {
            rev = rev + answer.charAt(i);
        }
        if(rev.equals(answer))
        {
            return true;
        }
        return false;
    }
    public boolean isPalindrome(String s) {
        String answer = "";
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
            {
                char ch = Character.toLowerCase(s.charAt(i));
                answer = answer + ch;
            }
            else if(s.charAt(i)>='a' && s.charAt(i)<='z')
            {
                answer = answer + s.charAt(i);
            }
            else if(Character.isDigit(s.charAt(i)))
            {
                answer = answer + s.charAt(i);
            }
        }
        boolean check = checkPalin(answer);
        return check;
    }
}