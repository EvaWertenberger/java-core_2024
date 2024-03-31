package lr3.Task8;

public class LinkedList {
    private Node head;
    // Вспомогательный класс для представления узла списка
    private class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
    // Ввод с головы
    public void createHead(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    // Ввод с хвоста
    public void createTail(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }
    // Вывод списка
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node curr = head;
        while (curr != null) {
            sb.append(curr.value).append(" ");
            curr = curr.next;
        }
        return sb.toString();
    }
    // Добавление элемента в начало списка
    public void addFirst(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    // Добавление элемента в конец списка
    public void addLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }
    // Вставка элемента в список с указанным номером
    public void insert(int value, int position) {
        if (position < 0) {
            System.out.println("Неверная позиция");
            return;
        }
        Node newNode = new Node(value);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node curr = head;
            int count = 0;
            while (curr != null && count < position - 1) {
                curr = curr.next;
                count++;
            }
            if (curr == null) {
                System.out.println("Неверная позиция");
                return;
            }
            newNode.next = curr.next;
            curr.next = newNode;
        }
    }
    // Удаление элемента с головы списка
    public void removeFirst() {
        if (head == null) {
            System.out.println("Список пуст");
            return;
        }
        head = head.next;
    }
    // Удаление последнего элемента списка
    public void removeLast() {
        if (head == null) {
            System.out.println("Список пуст");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
    }
    // Удаление элемента с указанным номером
    public void remove(int position) {
        if (head == null) {
            System.out.println("Список пуст");
            return;
        }
        if (position < 0) {
            System.out.println("Неверная позиция");
            return;
        }
        if (position == 0) {
            head = head.next;
            return;
        }
        Node curr = head;
        int count = 0;
        while (curr != null && count < position - 1) {
            curr = curr.next;
            count++;
        }
        if (curr == null || curr.next == null) {
            System.out.println("Неверная позиция");
            return;
        }
        curr.next = curr.next.next;
    }
    // Ввод с головы с использованием рекурсии
    public void createHeadRec(int value) {
        head = createHeadRecHelper(head, value);
    }
    private Node createHeadRecHelper(Node curr, int value) {
        if(curr == null) {
            curr = new Node(value);
        } else {
            Node newNode = new Node(value);
            newNode.next = curr;
            curr = newNode;
        }
        return curr;
    }
    // Ввод с хвоста с использованием рекурсии
    public void createTailRec(int data) {
        head = createTailRecHelper(head, data);
    }
    private Node createTailRecHelper(Node curr, int data) {
        if (curr == null) {
            return new Node(data);
        }
        curr.next = createTailRecHelper(curr.next, data);
        return curr;
    }
    // Вывод списка с использованием рекурсии
    public String toStringRec() {
        return toStringRecHelper(head);
    }
    private String toStringRecHelper(Node curr) {
        if (curr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(curr.value).append(" ");
        sb.append(toStringRecHelper(curr.next));
        return sb.toString();
    }
}
