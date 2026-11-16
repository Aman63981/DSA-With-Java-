import java.util.Stack;

class InfixEvaluation {
    public int precedence(char c) {
        switch (c) {
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

    public int operation(int operand1, int operand2, char c) {
        int res;
        switch (c) {
            case '+': {
                res = operand1 + operand2;
                break;
            }
            case '-': {
                res = operand1 - operand2;
                break;
            }
            case '*': {
                res = operand1 * operand2;
                break;
            }
            case '/': {
                res = operand1 / operand2;
                break;
            }
            case '^': {
                res = Math.powExact(operand1, operand2);
                break;
            }
            default: {
                res = 0;
            }
        }
        return res;
    }

    public int evaluation(String s) {
        Stack<Integer> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();
        if (s == null || s == "") {
            return -1;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int n = Character.getNumericValue(c);
                operandStack.push(n);
            } else {
                // if(operatorStack.isEmpty())
                // {
                //     operatorStack.push(c);
                // }
                // else if (precedence(c) >= precedence(operatorStack.peek()) && !operatorStack.isEmpty()) 
                // {
                //     operatorStack.push(c);
                // }
                // else {
                    while(!operatorStack.isEmpty() && (!(precedence(c)>= precedence(operatorStack.peek()))))
                    {
                        int operand2 = operandStack.pop();
                        int operand1 = operandStack.pop();
                        char operator = operatorStack.pop();
                        int res = operation(operand1, operand2, operator);
                        operandStack.push(res);
                    }
                    operatorStack.push(c);
                // }
            }
        }
        while (!operatorStack.isEmpty()) {
            int operand2 = operandStack.pop();
            int operand1 = operandStack.pop();
            char operator = operatorStack.pop();
            int res = operation(operand1, operand2, operator);
            operandStack.push(res);
        }
        return operandStack.pop();
    }

    public static void main(String args[]) {
        InfixEvaluation obj = new InfixEvaluation();
        String exp = "2+3*4^2-4";
        System.out.println(exp+" = " + obj.evaluation(exp));
    }
}