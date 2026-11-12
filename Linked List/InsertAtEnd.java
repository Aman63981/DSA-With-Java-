import java.util.Scanner;

class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return this.next;
    }
}

class InsertAtEnd {
    Node head = null, q = null;

    public void createNode(int data) {
        Node ptr = new Node(data);
        if (head == null) {
            head = ptr;
            ptr.setNext(null);
            q = ptr;
        } else {
            q.setNext(ptr);
            ptr.setNext(null);
            q = ptr;
        }
        System.out.println("Node created successfully");
    }

    public static void main(String args[]) {
        InsertAtEnd obj = new InsertAtEnd();
        Scanner s = new Scanner(System.in);
        int n, choice;
        do {
            System.out.println("If you want ot insert node then press 1 otherwise 0 : ");
            choice = s.nextInt();
            if (choice != 0) {
                System.out.println("Enter node data : ");
                n = s.nextInt();
                obj.createNode(n);
            }
        } while (choice != 0);
        Node ptr = obj.head;
        while (ptr != null) {
            System.out.print(ptr.getData() + "->");
            ptr = ptr.getNext();
        }
        System.out.println("Null");
        // insertion process
        System.out.println("Enter new node data to insert at ending : ");
        int newData = s.nextInt();
        Node newNode = new Node(newData);
        Node p = obj.head;
        newNode.setNext(null);
        if (p == null) {
            obj.head = newNode;
        } else {
            while (p.getNext() != null) {
                p = p.getNext();
            }
            if (p.getNext() == null) {
                p.setNext(newNode);
            }
        }
        System.out.println("New node inserted successfully");
        Node ref = obj.head;
        while(ref!=null)
        {
            System.out.print(ref.getData()+"->");
            ref=ref.getNext();
        }
        System.out.println("Null");
    }

}