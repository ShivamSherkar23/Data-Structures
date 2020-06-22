class Node {
    int data;
    Node next;

    public Node(int n) {
        this.data = n;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    public static LinkedList insert(LinkedList list, int data) {
        Node newn = new Node(data);
        newn.next = null;

        if (list.head == null) {
            list.head = newn;
        } else {
            Node temp = list.head;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newn;
        }
        return list;
    }

    public static void display(LinkedList list) {
        Node temp = list.head;

        System.out.print("LinkedList: ");

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        list = insert(list, 7);
        list = insert(list, 8);
        list = insert(list, 9);
        list = insert(list, 10);

        display(list);
    }
}
