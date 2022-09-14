class Solution {
    public boolean isValid(String s) {
        char c;
        Stack<Character> stack = new Stack<Character>();
        stack.push('$');
        for(int i = 0 ; i < s.length() ; i++)
        {
            c = s.charAt(i);
            if (c == '}' || c == ')' || c == ']')
            {
                if(stack.peek() == '$')
                    return false;
                if( (c == '}' && stack.peek() != '{') ||
                    (c == ')' && stack.peek() != '(') || ( c == ']' && stack.peek() != '[') )
                    return false;
                stack.pop();
            }
            else
                stack.push(c);    
        }
        if(stack.peek() != '$')
            return false;
        return true;
    }
}