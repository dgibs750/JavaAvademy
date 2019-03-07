public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        this.head = null;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    public void remove(int value) {
        Node currNode = this.head;
        Node prev = null;
        if(currNode != null && currNode.value == value) {
            this.head = currNode.next;
            return;
        }
        while(currNode != null && currNode.value != value) {
            prev = currNode;
            currNode = currNode.next;
        }
        if(currNode != null) {
            prev.next = currNode.next;
        }else {
            System.out.println(value + " not found");
        }
    }
    public void remove() {
        Node currNode = this.head;
        Node prev = null;
        if(currNode != null && currNode.next == null) {
            this.head = currNode.next;
            return;
        }
        while(currNode != null && currNode.next != null) {
            prev = currNode;
            currNode = currNode.next;
        }
        if(currNode != null) {
            prev.next = null;
        }
    }
    public void removeAt(int index) {
        Node currNode = this.head;
        Node prev = null;
        if(index == 0) {
            this.head = currNode.next;
            return;
        }
        for(int i = 0; i < index; i ++) {
            prev = currNode;
            currNode = currNode.next;
        }
        prev.next = currNode.next;
    }
    public void printValues() {
        Node currNode = this.head;
        while(currNode != null) {
            System.out.print(currNode.value + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }     
}