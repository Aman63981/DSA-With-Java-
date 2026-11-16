class ListNode
{
    private int data;
    private ListNode next;
    public ListNode(int data)
    {
        this.data = data;
        next = null;
    }
    public void setData(int data)
    {
        this.data = data;
    }
    public void setNext(ListNode next)
    {
        this.next = next;
    }
    public int getData()
    {
        return data;
    }
    public ListNode getNext()
    {
        return this.next;
    }
}
class LinkedStack
{
    int length;
    ListNode top;
    public LinkedStack()
    {
        length = 0;
        top=null;
    }
    public boolean isEmpty()
    {
        return (top==null);
    }
    public void push(int data)
    {
        ListNode temp = new ListNode(data);
        temp.setNext(top);
        top=temp;
        length++;
        System.out.println("Element pushed in stack "+ data);
    }
    public void pop()
    {
        if(top==null)
        {
            System.out.println("Stack is empty so underflow!");
            return ;
        }
        else{
            int data = top.getData();
            top=top.getNext();
            length--;
            System.out.println("Element poped from stack "+ data);
        }
    }
    public void peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return ;
        }
        else{
            System.out.println("Top most element of stack "+ top.getData());
        }
    }
    public int size()
    {
        return length;
    }
    public String toString()
    {
        String result = "";
        ListNode ptr = top;
        while(ptr!=null)
        {
            result+=ptr.getData()+"\t";
            ptr=ptr.getNext();
        }
        return result;
    }
}

class LinkedListStack
{
    public static void main(String args[])
    {
        LinkedStack s = new LinkedStack();
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        s.push(10);
        s.peek();
        s.pop();
        System.out.println(s.isEmpty());
        System.out.println(s.size());
    }
}