class Solution {
    public boolean isNumber(String str)
    {
        if(str.length()==1)
        {
            char ch = str.charAt(0);
            if(ch=='+'||ch=='-'||ch=='*'||ch=='/')
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        return true;
    }
    public int evalRPN(String[] tokens) {
        int result = 0;
        Stack<String> bucket = new Stack<>();
        
        for(int i=0; i<tokens.length; i++)
        {
            String str = tokens[i];
            if(isNumber(str))
            {
                bucket.push(str);
            }
            else
            {
                int a = Integer.parseInt(bucket.pop());
                int b = Integer.parseInt(bucket.pop());
                switch(str)
                {
                    case "+": bucket.push(String.valueOf(b+a));
                    break;
                    case "-": bucket.push(String.valueOf(b-a));
                    break;
                    case "*": bucket.push(String.valueOf(b*a));
                    break;
                    case "/": bucket.push(String.valueOf(b/a));
                    break;
                }
            }
        }
        result = Integer.parseInt(bucket.peek());
        return result;
    }
}