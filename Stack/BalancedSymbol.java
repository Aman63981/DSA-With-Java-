import java.util.Stack;

class BalancedSymbol {
    public boolean isValidPattern(String s)
    {
        Stack<Character> stk = new Stack<>();
        if(s==null || s.length()==0)
        {
            return true;
        }
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[')
            {
                stk.push(s.charAt(i));
            }
            else if(s.charAt(i)==')')
            {
                if(!stk.isEmpty() && stk.peek()=='(')
                {
                    stk.pop();
                }
                else{
                    return false;
                }
            }
            else if(s.charAt(i)=='}')
            {
                    if(!stk.isEmpty() && stk.peek()=='{')
                    {
                        stk.pop();
                    }
                    else{
                        return false;
                    }
            }
            else if(s.charAt(i)==']')
            {
                    if(!stk.isEmpty() && stk.peek()=='[')
                    {
                        stk.pop();
                    }
                    else{
                        return false;
                    }
            }
                
        }
        if(stk.isEmpty())
        {
             return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String args[])
    {
        BalancedSymbol obj = new BalancedSymbol();
        System.out.println("Is the parenthesis or symbol balanced in you expression ? \n Answer :  "+ obj.isValidPattern("(a+b)*(c-d)"));
        boolean e1 = obj.isValidPattern("[(a+b)*{((c-d)*e)}/f]");
        System.out.println(e1);
        boolean e2 = obj.isValidPattern("[3/(a+b))*e]");
        System.out.println(e2);
        System.out.println(obj.isValidPattern(null));
        System.out.println(obj.isValidPattern("") );
    }
}













// import java.util.EmptyStackException;
// import java.util.Stack;

// class BalancedSymbol
// {
// public static void main(String args[])
// {
// try{
// Stack<Integer> s = new Stack<>();
// s.push(10);
// System.out.println("Top most element "+ s.peek());
// System.out.println("Element poped from stack "+ s.pop());
// System.out.println("Stack empty ? "+ s.isEmpty());
// System.out.println("Size of stacK :"+ s.size());
// System.out.println("Top most element of stack "+ s.peek());
// // if(s.isEmpty())
// // {
// // System.out.println("Stac is empty");
// // return ;
// // }
// // else{
// // System.out.println("Top most element of stack "+ s.peek());
// // }
// }
// catch(EmptyStackException e)
// {
// System.out.println("Stack is empty");
// }

// }
// }

// // using fixed size array stack
// class FixedSizeArrayStack
// {
// public int capacity;
// public static final int CAPACITY=10;
// public char[]stackRep;
// private int top=-1;
// // default stack implement
// public FixedSizeArrayStack()
// {
// stackRep = new char[CAPACITY];
// capacity=CAPACITY;
// }
// // stack implement by given user capacity
// public FixedSizeArrayStack(int cap)
// {
// capacity=cap;
// stackRep=new char[capacity];
// }
// public int size()
// {
// return top+1;
// }
// public boolean isEmpty()
// {
// return top<0;
// }
// public boolean isFull()
// {
// return (size()==capacity);
// }
// public void push(char data)
// {
// if(isFull())
// {
// System.out.println("Stack is full so overflow");
// return;
// }
// else{
// stackRep[++top]=data;
// System.out.println("Element pushed in stack "+ data);
// }
// }
// public void pop()
// {
// if(isEmpty())
// {
// System.out.println("Stack is empty so underflow");
// return ;
// }
// else{
// char data = stackRep[top];
// stackRep[top--]=Character.MIN_VALUE;
// System.out.println("Element poped from stack "+ data);
// }
// }
// public void top()
// {
// if(isEmpty())
// {
// System.out.println("Stack is empty");
// return;
// }
// else{
// System.out.println("Top most element of stack "+ stackRep[top]);
// }
// }
// public String toString()
// {
// String s = "[";
// if(size()>0)
// {
// s+=stackRep[0];
// }
// if(size()>1)
// {
// for(int i=1; i<size(); i++)
// {
// s+=", "+stackRep[i];
// }
// }
// return s+"]";
// }
// }

// class BalancedSymbol
// {
// public void checkSymbol(String str)
// {
// FixedSizeArrayStack s = new FixedSizeArrayStack();
// for(int i=0; i<str.length(); i++)
// {
// if(str.charAt(i)==')')
// {
// s.push(str.charAt(i));
// }
// if(str.charAt(i)=='(')
// {
// s.pop();
// }
// }
// if(s.isEmpty())
// {
// System.out.println("The symbols/parenthesis are balanced in expression");
// }
// }
// public static void main(String args[])
// {
// BalancedSymbol obj = new BalancedSymbol();
// obj.checkSymbol("(a+b)*(c-d)");
// }
// }