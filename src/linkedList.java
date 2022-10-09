import javax.xml.crypto.Data;

public class linkedList {
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    public void addFirst(String data) {
        if (isEmpty()) {
            head = new Node(data);
            tail = head;
            return;
        }
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        if (isEmpty()) {
            head = new Node(data);
            tail = head;
            return;
        }
        Node newNode = new Node(data);
        tail.next = newNode;
        tail = newNode;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public void add(int pos, String data) {
        // validate pos using size
        if (pos == 1) {
            addFirst(data);
            return;
        }
        Node current = head;
        int count = 1;
        while (count < pos - 1) {
            count++;
            current = current.next;
        }
        Node newNode = new Node(data);
        newNode.next = current.next;
        current.next = newNode;
    }

}
