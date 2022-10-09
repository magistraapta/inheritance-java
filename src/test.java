public class test {
 
    class Node {
        String val;
        Node next;
 
        Node(String val){
            this.val = val;
        }
    }
 
    private Node head;
    private Node tail;
 
    public void addFirst(String val){
        if(isEmpty()) {
            head = new Node(val);
            tail = head;
            return;
        }
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }
 
    public void addLast(String val){
        if(isEmpty()) {
            head = new Node(val);
            tail = head;
            return;
        }
        Node newNode = new Node(val);
        tail.next = newNode;
        tail = newNode;
    }
 
    public void add(int pos, String val){
        // validate pos using size
        if( pos == 1 ){
            addFirst(val);
            return;
        }
        Node current = head;
        int count = 1;
        while(count < pos-1) {
            count++;
            current = current.next;
        }
        Node newNode = new Node(val);
        newNode.next = current.next;
        current.next = newNode;
    }
 
 
    public boolean search(String val){
        Node current = head;
        while(current != null){
            if(val == current.val) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
 
    public boolean isEmpty(){
        return head == null ;
    }
 
 
    public void print(){
        Node current = head;
        while(current != null){
            System.out.print(current.val +" -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }
 
    // Driver Method
    public static void main(String[] args) {
        test ll = new test();
 
        ll.addFirst("kambing");
        ll.addFirst("kucing");
        ll.print();
        
       
 
    }
 
 
}