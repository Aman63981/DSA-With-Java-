import java.util.Scanner;

class Node
{
    private int data;
    private Node next;
    public Node(int data)
    {
        this.data = data;
    }
    public void setData(int data)
    {
        this.data = data;
    }
    public int getData()
    {
        return data;
    }
    public Node getNext()
    {
        return this.next;
    }
    public void setNext(Node next)
    {
        this.next = next;
    }
}
class InsertBef
{
    Node head=null, q=null;
    public void create(int data)
    {
        Node ptr = new Node(data);
        if(head==null)
        {
            head=ptr;
            q=ptr;
        }
        else{
            q.setNext(ptr);
            ptr.setNext(null);
            q=ptr;
        }
        System.out.println("Node created successfully");
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        InsertBef obj = new InsertBef();
        int choice, n;
        do{
            System.out.println("If you want to create node then press 1 otherwise 0 : ");
            choice = s.nextInt();
            if(choice!=0)
            {
                System.out.println("Enter node data : ");
                n = s.nextInt();
                obj.create(n);
            }
        }while(choice!=0);
        Node ptr = obj.head;
        while(ptr!=null)
        {
            System.out.print(ptr.getData()+"->");
            ptr = ptr.getNext();
        }
        System.out.println("NULL");
        //insertion process
        System.out.println("Enter new node data : ");
        int newData=s.nextInt();
        Node newNode = new Node(newData);
        newNode.setNext(null);
        System.out.println("Enter your target data : ");
        int target = s.nextInt();
        Node p=obj.head, r=obj.head;
        if(p==null)
        {
            obj.head=newNode;
        }
        else if(p.getData()==target)
        {
            newNode.setNext(obj.head);
            obj.head = newNode;
        }
        else{
            while(p.getData()!=target && p.getNext()!=null)
            {
                r=p;
                p=p.getNext();
            }
            if(p.getData()==target)
            {
                r.setNext(newNode);
                newNode.setNext(p);
            }
            System.out.println("New node inserted successfully");
        }
        Node ref = obj.head;
        while(ref!=null)
        {
            System.out.print(ref.getData()+"->");
            ref = ref.getNext();
        }
        System.out.println("NULL");
    }
}