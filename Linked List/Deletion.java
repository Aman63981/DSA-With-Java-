import java.util.Scanner;

class Node
{
    private int data;
    private Node next;
    private Node prev;
    public Node(int data)
    {
        this.data=data;
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
        this.next=next;
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
class Deletion
{
    Node head=null, q=null;
    public void create(int data)
    {
        Node ptr=new Node(data);
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
    }

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        Deletion obj = new Deletion();
        int n, choice;
        do{
            System.out.println("If you want to create node then press 1 otherwise 0 : ");
            choice = s.nextInt();
            if(choice!=0)
            {
                System.out.println("ENter node data : ");
                n = s.nextInt();
                obj.create(n);
            }
        }while(choice!=0);
        Node ptr=obj.head;
        while (ptr!=null) {
            System.out.print(ptr.getData()+"->");
            ptr=ptr.getNext();
        }
        System.out.println("NULL");

        //deletion process
        //deletion from begining
        // Node p=obj.head;
        // if(p==null)
        // {
        //     System.out.println("Linked list is empty so underflow");
        //     return;
        // }
        // else if(p.getNext()==null)
        // {
        //     obj.head=null;
        //     p=null;
        // }
        // else{
        //     p.getNext().setPrev(null);
        //     obj.head=p.getNext();
        //     p=null;
        // }
        // System.out.println("Node deleted from begining");

        //delete from end
        // Node p=obj.head;
        // if(p==null)
        // {
        //     System.out.println("Linked list is empty so underflow");
        //     return;
        // }
        // else if(p.getNext()==null){
        //     obj.head=null;
        //     p=null;
        // }
        // else{
        //     while(p.getNext()!=null)
        //     {
        //         p=p.getNext();
        //     }
        //     if(p.getNext()==null)
        //     {
        //         p.getPrev().setNext(null);
        //         p=null;
        //     }
        // }
        // System.out.println("Node deleted from ending successfuly");

        //deletion from given node
        Node p=obj.head;
        System.out.println("Enter your target node to be delete : ");
        int delNode = s.nextInt();
        if(p==null)
        {
            System.out.println("Linked list is empty so underflow ");
            return;
        }
        else if(p.getData()==delNode)
        {
            p.getNext().setPrev(null);
            obj.head=p.getNext();
            p=null;
        }
        else{
            while(p.getData()!=delNode && p.getNext()!=null)
            {
                p=p.getNext();
            }
            if(p.getData()==delNode)
            {
                p.getPrev().setNext(p.getNext());
                p.getNext().setPrev(p.getPrev());
                p=null;
            }
        }
        System.out.println("Node deleted successfully");

        Node ref = obj.head;
        while(ref!=null)
        {
            System.out.print(ref.getData()+"->");
            ref=ref.getNext();
        }
        System.out.println("NULL");
    }
}