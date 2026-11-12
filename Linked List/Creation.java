import java.util.Scanner;

class Node 
{
    private int data;
    private Node next;
    private Node prev;
    public Node(int data)
    {
        this.data = data;
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
        this.prev = prev;
    }
    public Node getPrev()
    {
        return this.prev;
    }
}
class Creation
{
    Node head = null, q=null;
    public void create(int data)
    {
        Node ptr = new Node(data);
        if(head==null)
        {
            head=ptr;
            q=ptr;
            ptr.setNext(null);
            ptr.setPrev(null);
        }
        else{
            q.setNext(ptr);
            ptr.setPrev(q);
            ptr.setNext(null);
            q=ptr;
        }
        System.out.println("Node created successfully!");
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        // Node n1 =new Node(10);
        // Node n2 =new Node(20);
        // Node n3 = new Node(30);
        // Node n4 =new Node(40);
        // n1.setNext(n2);
        // n2.setNext(n3);
        // n3.setNext(n4);
        // n4.setNext(null);
        // n1.setPrev(null);
        // n2.setPrev(n1);
        // n3.setPrev(n2);
        // n4.setPrev(n3);
        // System.out.println(n1.getData());
        // System.out.println(n1.getNext());
        // System.out.println(n1.getPrev());
        Creation obj = new Creation();
        int choice, n;
        do{
            System.out.println("If you want to insert node then press 1 otherwise 0 : ");
            choice = s.nextInt();
            if(choice!=0)
            {
                System.out.println("Enter node data : ");
                n=s.nextInt();
                obj.create(n);
            }
        }while(choice!=0);
        Node ptr=obj.head;
        while(ptr!=null)
        {
            System.out.print(ptr.getData()+"->");
            ptr=ptr.getNext();
        }
    }
}