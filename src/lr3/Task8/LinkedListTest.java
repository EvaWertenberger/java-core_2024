package lr3.Task8;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        // Ввод с головы
        list.createHead(3);
        list.createHead(2);
        list.createHead(1);
        System.out.println("Список после ввода с головы: " + list); // Ожидаемый результат: 1 2 3
        // Ввод с хвоста
        list.createTail(4);
        list.createTail(5);
        list.createTail(6);
        System.out.println("Список после ввода с хвоста: " + list); // Ожидаемый результат: 1 2 3 4 5 6
        // Добавление элемента в начало списка
        list.addFirst(0);
        System.out.println("Список после добавления в начало: " + list); // Ожидаемый результат: 0 1 2 3 4 5 6
        // Добавление элемента в конец списка
        list.addLast(7);
        System.out.println("Список после добавления в конец: " + list); // Ожидаемый результат: 0 1 2 3 4 5 6 7
        // Вставка элемента в список с указанным номером
        list.insert(100, 4);
        System.out.println("Список после вставки элемента: " + list); // Ожидаемый результат: 0 1 2 3 100 4 5 6 7
        // Удаление элемента с головы списка
        list.removeFirst();
        System.out.println("Список после удаления с головы: " + list); // Ожидаемый результат: 1 2 3 100 4 5 6 7
        // Удаление последнего элемента списка
        list.removeLast();
        System.out.println("Список после удаления с хвоста: " + list); // Ожидаемый результат: 1 2 3 100 4 5 6
        // Удаление из списка элемента с указанным номером
        list.remove(3);
        System.out.println("Список после удаления элемента: " + list); // Ожидаемый результат: 1 2 3 4 5 6
        // Ввод с головы с использованием рекурсии
        list.createHeadRec(9);
        list.createHeadRec(8);
        System.out.println("Список после ввода с головы с использованием рекурсии: " + list.toStringRec()); // Ожидаемый результат: 8 9 1 2 3 4 5 6
        // Ввод с хвоста с использованием рекурсии
        list.createTailRec(7);
        list.createTailRec(6);
        System.out.println("Список после ввода с хвоста с использованием рекурсии: " + list.toStringRec()); // Ожидаемый результат: 8 9 1 2 3 4 5 6 7 6
    }
}
