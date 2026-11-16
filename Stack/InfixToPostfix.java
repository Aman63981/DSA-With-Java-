import java.util.Stack;

class InfixToPostfix
{
    public int precedence(char c)
    {
        switch(c)
        {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    public String converToPostfix(String exp)
    {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        for(int i=0; i<exp.length(); i++)
        {
            char c = exp.charAt(i);
            if(Character.isLetterOrDigit(c))
            {
                result.append(c);
            }
            else if(c=='(')
            {
                stack.push(c);
            }
            else if(c==')')
            {
                while(!stack.isEmpty() && stack.peek()!='(')
                {
                    result.append(stack.pop());
                }
                stack.pop();
            }
            else{
                while(!stack.isEmpty() && precedence(c)<= precedence(stack.peek()))
                {
                    if(c=='^' && stack.peek()=='^')
                    {
                        break;
                    }
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while(!stack.isEmpty())
        {
            result.append(stack.pop());
        }
        return result.toString();
    }
    public static void main(String args[])
    {
        InfixToPostfix obj = new InfixToPostfix();
        String infix = "a+b*c^d-e";//"a+b*c^d^e";//"(a+b)*(c-d)";
        System.out.println("Infix expression "+ infix);
        System.out.println("Postfix expression "+ obj.converToPostfix(infix));
    }
}