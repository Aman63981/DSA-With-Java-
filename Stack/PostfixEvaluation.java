import java.util.Stack;

class PostfixEvaluation
{
    public double evaluation(String s)
    {
        Stack<Double> stack = new Stack<>();
        if(s==null || s=="")
        {
            return 0;
        }
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(Character.isDigit(c))
            {
                double num = Character.getNumericValue(c);
                stack.push(num);
            }
            else{
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                double res;
                switch(c)
                {
                    case '+':
                        {
                            res=operand1+operand2;
                            break;
                        }
                    case '-':
                        {
                            res = operand1-operand2;
                            break;
                        }
                    case '*':
                        {
                            res = operand1*operand2;
                            break;
                        }
                    case '/':
                        {
                            res = operand1/operand2;
                            break;
                        }
                    case '^':
                        {
                            res = Math.pow(operand1, operand2);
                            break;
                        }
                    case '%':
                        {
                            res = operand1%operand2;
                            break;
                        }
                    default : 
                    {
                        System.out.println("Invalid Operator");
                        return 0;
                    }
                }
                stack.push(res);
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        PostfixEvaluation obj = new PostfixEvaluation();
        double res = obj.evaluation("123*+5-");
        System.out.println(res);
        System.out.println(obj.evaluation("53+82-*"));
        System.out.println(obj.evaluation(null));
    }
}