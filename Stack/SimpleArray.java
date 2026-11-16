class FixedSizeArraystack
{
     int capacity;
     public static final int CAPACITY=10;
     int []stackRep;
     int top=-1;    
    public FixedSizeArraystack()
    {
        stackRep = new int[CAPACITY];
        capacity=CAPACITY;
    }
    public FixedSizeArraystack(int cap)
    {
        capacity=cap;
        stackRep = new int[capacity];
    }
    public int size()
    {
        return (top+1);
    }
    boolean isEmpty()
    {
        return (top<0);
    }
    boolean isFull()
    {
        return (top+1 == capacity);
    }
    public void push(int data)
    {
        if(size()==capacity)
        {
            System.out.println("stackRepRep is full so overflow!");
            return ;
        }
        else{
            stackRep[++top] = data;
            System.out.println("Element pushed in stackRepRep "+ data);
        }
    }
    public void top()
    {
        if(isEmpty())
        {
            System.out.println("stackRepRep is empty!");
            return;
        }
        else{
            System.out.println("Top most element is "+ stackRep[top]);
        }
    }
    public void pop()
    {
        int data;
        if(isEmpty())
        {
            System.out.println("stackRepRep is empty so underflow!");
            return;
        }
        else{
            data=stackRep[top];
            stackRep[top--]=Integer.MIN_VALUE;
            System.out.println("stackRepRep poped element "+ data);
        }
    }
    public String toString()
    {
        String s = "[";
        if(size()>0)
        {
            s+=stackRep[0];
        }
        if(size()>1)
        {
            for(int i=1; i<=size()-1; i++)
            {
                s+=", "+stackRep[i];
            }
        }
        return s+"]";
    }
}
class SimpleArray
{
    public static void main(String args[])
    {
        FixedSizeArraystack s = new FixedSizeArraystack(5);
        System.out.println(s.isEmpty());
        System.out.println(s.isFull());
        System.out.println(s.size());
        s.pop();
        s.top();
        s.push(10);
        System.out.println(s.isEmpty());
        System.out.println(s.isFull());
        s.top();
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.top();
        System.out.println(s.isEmpty());
        System.out.println(s.isFull());
        System.out.println(s.toString());
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        System.out.println(s.toString());
        FixedSizeArraystack n = new FixedSizeArraystack();
        System.out.println(n.isEmpty());
        n.push(20);
        System.out.println(n.size());        
    }
}