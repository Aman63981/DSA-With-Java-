import java.util.Scanner;

class ListNode
{
    private int data;
    private ListNode next;
    public ListNode(int data)
    {
        this.data = data;
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
class InsertAtBeg
{
    ListNode head = null, q = null;
    public void createNode(int data)
    {
        ListNode ptr = new ListNode(data);
        if(head==null)
        {
            ptr.setNext(ptr);
            head=ptr;
            q=ptr;
            System.out.println("Node created");
        }
        else{
            q.setNext(ptr);
            ptr.setNext(null);
            q=ptr;
            System.out.println("Node created");
        }
    }
    public static void main(String args[])
    {
        InsertAtBeg obj = new InsertAtBeg();
        Scanner s = new Scanner(System.in);
        int n, choice;
        do{
            System.out.println("If you want to insert node then press 1 otherwise 0 : ");
            choice = s.nextInt();
            if(choice!=0)
            {
                System.out.println("Enter your data : ");
                n = s.nextInt();
                obj.createNode(n);
            }
        }while(choice!=0);
        ListNode ptr = obj.head;
        while(ptr!=null)
        {
            System.out.print(ptr.getData()+" ->");
            ptr = ptr.getNext();
        }
        System.out.println("NULL");
        // insertion process
        System.out.println("Enter node data to insert at begining : ");
        int newData = s.nextInt();
        ListNode p = obj.head;
        ListNode newNode = new ListNode(newData);
        newNode.setNext(null);
        if(p==null)
        {
            obj.head = newNode;
            System.out.println("Node inserted successfully!");
        }
        else{
            newNode.setNext(obj.head);
            obj.head = newNode;
            System.out.println("Node inserted Successfully");
        }
        ListNode ref= obj.head;
        while(ref!=null)
        {
            System.out.print(ref.getData()+"->");
            ref=ref.getNext();
        }
        System.out.println("NULL");

    }
}