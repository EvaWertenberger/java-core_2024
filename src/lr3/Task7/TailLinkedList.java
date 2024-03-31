package lr3.Task7;

public class TailLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node tail = new Node(1);
        list.head = tail;
        tail.next = new Node(2);
        tail = tail.next;
        tail.next = new Node(3);
        tail = tail.next;
        System.out.println(list.head.value);
        System.out.println(list.head.next.value);
        System.out.println(list.head.next.next.value);
    }
}
