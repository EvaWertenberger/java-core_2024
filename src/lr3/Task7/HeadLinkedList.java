package lr3.Task7;

public class HeadLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.head.value);
        System.out.println(list.head.next.value);
        System.out.println(list.head.next.next.value);
    }
}
