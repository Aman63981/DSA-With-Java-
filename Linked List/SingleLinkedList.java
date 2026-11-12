import java.util.Scanner;

class ListNode {
    private int data;
    private ListNode next;

    public ListNode(int data) {
        this.data = data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public ListNode getNext() {
        return this.next;
    }
}

class SingleLinkedList {

    public ListNode head = null, q=null;
    public void createNode(int data) {
        ListNode ptr = new ListNode(data);
        if(head==null)
        {
            ptr.setNext(head);
            head = ptr;
            q=ptr;
        }
        else{
            ptr.setNext(null);
            q.setNext(ptr);
            q=ptr;
        }
    }

    public static void main(String args[]) 
    {
        Scanner s = new Scanner(System.in);
        SingleLinkedList obj = new SingleLinkedList();
        int n, choice;
        do{
            System.out.println("Do you want to create node then press 1 otherwise 0 : ");
            choice = s.nextInt();
            if(choice!=0)
            {
                System.out.println("Enter your node data : ");
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
        s.close();

        // ListNode n1 = new ListNode(10);
        // ListNode n2 = new ListNode(20);
        // ListNode n3 = new ListNode(30);
        // n1.setNext(n2);
        // n2.setNext(n3);
        // // System.out.println(n1.getData());
        // // n1.setData(5);
        // // System.out.println(n1.getData());
        // // // ListNode current = n1.getNext();
        // // // System.out.println(current.getData());
        // ListNode ptr = n1;
        // while(ptr!=null)
        // {
        // System.out.print(ptr.getData()+"->");
        // ptr = ptr.getNext();
        // }
        // System.out.println("NULL");
    }
}