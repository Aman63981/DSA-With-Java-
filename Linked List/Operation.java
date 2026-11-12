import java.util.Scanner;

class Node 
{
    private int data;
    private Node next;
    private Node prev;
    public Node(int data)
    {
        this.data = data;
        prev=null;
        next=null;
    }
    public void setData(int data)
    {
        this.data=data;
    }
    public int getData()
    {
        return data;
    }
    public void setNext(Node next)
    {
        this.next = next;
    }
    public Node getNext()
    {
        return this.next;
    }
    public void setPrev(Node prev)
    {
        this.prev=prev;
    }
    public Node getPrev()
    {
        return this.prev;
    }
}
class Operation
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
            ptr.setPrev(q);
            q=ptr;
        }
        System.out.println("Node created successfully");
    }
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        Operation obj = new Operation();
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
            ptr=ptr.getNext();
        }
        System.out.println("NULL");
        // insertion Process
        //insert at begining

        // System.out.println("Enter new data to insert at begining : ");
        // int newData=s.nextInt();   
        // Node newNode = new Node(newData);
        // Node p=obj.head;
        // if(p==null)
        // {
        //     obj.head=newNode;
        // }
        // else{
        //     obj.head.setPrev(newNode);
        //     newNode.setNext(obj.head);
        //     obj.head=newNode;
        // }
        // System.out.println("New node inserted successfully!");

        //insert at ending
        // System.out.println("Enter new node data to insert at end : ");
        // int newData = s.nextInt();
        // Node newNode = new Node(newData);
        // Node p=obj.head;
        // if(p==null)
        // {
        //     obj.head=newNode;
        // }
        // else{
        //     while(p.getNext()!=null)
        //     {
        //         p=p.getNext();
        //     }
        //     if(p.getNext()==null)
        //     {
        //         p.setNext(newNode);
        //         newNode.setPrev(p);
        //     }
        // }
        // System.out.println("New node inserted at end successfully");

        // insert before given node
        System.out.println("Enter new node data to insert before node : ");
        int newData = s.nextInt();
        Node newNode = new Node(newData);
        System.out.println("enter your target node : ");
        int target =s.nextInt();
        Node p=obj.head;
        if(p==null)
        {
            obj.head=null;
        }
        else if(p.getData()==target)
        {
            newNode.setNext(p);
            p.setPrev(newNode);
            obj.head=newNode;
        }
        else{
            while(p.getData()!=target && p.getNext()!=null)
            {
                p=p.getNext();
            }
            if(p.getData()==target)
            {
                p.getPrev().setNext(newNode);
                newNode.setPrev(p.getPrev());
                newNode.setNext(p);
                p.setPrev(newNode);
            }
            else{
                System.out.println("Node not found");
                return;
            }
            System.out.println("New node inserted successfully");
        }

        Node ref=obj.head;
        while(ref!=null)
        {
            System.out.print(ref.getData()+"->");
            ref=ref.getNext();
        }
        System.out.println("NULL");
    }
}