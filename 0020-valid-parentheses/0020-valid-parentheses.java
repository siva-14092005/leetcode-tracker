class Solution {
    public boolean isValid(String s) 
    {
        /*Deque<Character> stack = new ArrayDeque<>();

        for(int i = 0 ;i< s.length();i++)
        {
            char c = s.charAt(i);

            if(c=='('||c=='['||c=='{')
            {
                stack.push(c);
            }
            else
            {
                
                if(stack.isEmpty()) return false;
                if(!stack.isEmpty())
                {
                    char x = stack.peek();

                    if ((x== '(' && c==')') ||(x== '{' && c=='}')|| (x== '[' && c==']' ))
                    stack.pop();
                    else
                    return false;
                        
                }
                
            }

        }


        if(stack.isEmpty()) return true;
         
         return false;*/

         Deque<Character> stack = new ArrayDeque<>();
         for(char c : s.toCharArray())
         {
            if(c=='(' || c == '{' ||  c == '[') stack.push(c);
            else
            {
                if(stack.isEmpty()) return false;
                else
                {
                    char x  = stack.peek();
                    if( (x=='(' && c ==')') || (x=='{' && c =='}') || (x=='[' && c ==']') )
                    stack.pop();
                    else return false;
                }
            }
         }
         if(stack.isEmpty()) return true;
         return false;
    }
}