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
    public void setNext(Node next)
    {
        this.next = next;
    }
    public Node getNext()
    {
        return this.next;
    }
}
class Deletion
{
    Node head=null, q=null;
    public void create(int data)
    {
        Node ptr = new Node(data);
        if(head==null)
        {
            head=ptr;
            ptr.setNext(null);
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
        Deletion obj =new Deletion();
        int n, choice;
        do{
            System.out.println("If you want to insert node then press 1 otherwise 0 : ");
            choice = s.nextInt();
            if(choice!=0)
            {
                System.out.println("Enter your node data : ");
                n =s.nextInt();
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
        // deletion process
        // delete from begining
        // Node p = obj.head;
        // if(p==null)
        // {
        //     System.out.println("Linked list is empty so underflow");
        //     return;
        // }
        // else{
        //     obj.head=p.getNext();
        //     p=null;
        // }
        // System.out.println("Node deleted from begining");
        
        // Node ref = obj.head;
        // while(ref!=null)
        // {
        //     System.out.print(ref.getData()+"->");  
        //     ref=ref.getNext();
        // }
        // System.out.println("NULL");
        
        //deletion from end
        // Node r = obj.head, p=obj.head;
        // if(r==null)
        // {
        //     System.out.println("Linked list is empty so underflow");
        //     return;
        // }
        // else if(r.getNext()==null)
        // {
        //     obj.head=null;
        //     r=null;
        // }
        // else{
        //     while(r.getNext()!=null)
        //     {
        //         p=r;
        //         r=r.getNext();
        //     }
        //     if(r.getNext()==null)
        //     {
        //         p.setNext(null);
        //         r=null;
        //     }
        // }
        // System.out.println("Node deleted from end");
        // Node ref = obj.head;
        // while(ref!=null)
        // {
        //     System.out.print(ref.getData()+"->");
        //     ref=ref.getNext();
        // }
        // System.out.println("NULL");

        //delete from given node
        Node r=obj.head, p=obj.head;
        System.out.println("Enter your node data that you want to delete : ");
        int delData = s.nextInt();
        if(r==null)
        {
            System.out.println("Linked list is empty so underflow");
            return;
        }
        else if(r.getData()==delData)
        {
            obj.head=obj.head.getNext();
            r=null;
        }
        else{
            while(r.getData()!=delData && r.getNext()!=null)
            {
                p=r;
                r=r.getNext();
            }
            if(r.getData()==delData)
            {
                p.setNext(r.getNext());
                r=null;
            }
            else{
                System.out.println("Node not found");
            }
        }
        Node ref = obj.head;
        while(ref!=null) {
            System.out.print(ref.getData()+"->");
            ref=ref.getNext();
        }
        System.out.println("NULL");
    }
}