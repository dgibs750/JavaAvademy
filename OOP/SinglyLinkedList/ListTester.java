public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(3);
        sll.add(4);
        sll.add(10);
        sll.add(5);
        sll.add(15);
        sll.add(2);
        sll.add(39);
        sll.add(6);
        sll.printValues();
        sll.remove();
        sll.remove();
        sll.printValues();
        sll.remove(4);
        sll.remove(39);
        sll.printValues();
        sll.removeAt(0);
        sll.removeAt(1);
        sll.printValues();
    }
}