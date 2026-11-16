class DynamicStack
{
    int capacity;
    int []stackRep;
    public static final int CAPACITY = 10;
    int top = -1;
    public DynamicStack()
    {
        stackRep = new int[CAPACITY];
        capacity = CAPACITY;
    }
    public DynamicStack(int cap)
    {
        capacity = cap;
        stackRep = new int[capacity];
    }
    public int size()
    {
        return (top+1);
    }
    public boolean isEmpty()
    {
        return (top<0);
    }
    public boolean isFull()
    {
        return (top+1 == capacity);
    }
    public void top()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }
        else{
            System.out.println("Top most element of stack "+ stackRep[top]);
        }
    }
    public void push(int data)
    {
        if(size()==capacity)
        {
            System.out.println("Stack is full");
            expand();
            System.out.println("Hence, size of stack is increased");
        }
        stackRep[++top]=data;
        System.out.println("Element pushed in stack "+ data);
    }
    public void expand()
    {
        int newSize = stackRep.length*2;
        int []newStack = new int[newSize];
        capacity=newSize;
        //copy all element in newStack
        for(int i=0; i<stackRep.length; i++)
        {
            newStack[i]=stackRep[i];
        }
        stackRep = newStack;
        System.out.println("Stack was fulled so increase size "+ newSize);
    }
    public void pop()
    {
        int data;
        if(isEmpty())
        {
            System.out.println("Stack is empty so underflow");
            return;
        }
        else{
            data = stackRep[top];
            stackRep[top--] = Integer.MIN_VALUE;
            System.out.println("Element poped from stack "+ data);
        }
    }
}
class DynamicArrayStack
{
    public static void main(String args[])
    {
        DynamicStack s = new DynamicStack(5);
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        s.push(10);
        s.top();
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s.size());
        s.push(60);
        s.top();
        s.push(70);
        s.push(80);
        s.push(90);
        s.push(100);
        System.out.println(s.size());
        s.push(110);
        s.push(120);
        s.push(130);
        s.push(140);
        s.push(150);
        System.out.println(s.size());
        System.out.println(s.isEmpty()+ "  "+ s.isFull());
        s.push(160);
        s.push(170);
        s.push(180);
        s.push(190);
        s.push(200);
        System.out.println(s.size());
        System.out.println(s.isFull());
        s.push(210);
    }
}