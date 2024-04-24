/*. Разработать проект, в котором для ввода, вывода и изменения односвязного линейного списка создать следующие методы:
        а) с использованием цикла:
        •	ввод с головы createHead();
        •	ввод с хвоста createTail();
        •	вывод (возвращается строка, сформированная из элементов списка) toString();
        •	добавление элемента в начало списка AddFirst();
        •	добавление элемента в конец списка AddLast();
        •	вставка элемента в список с указанным номером Insert();
        •	удаление элемента с головы списка RemoveFirst();
        •	удаление последнего элемента списка RemoveLast();
        •	удаление из списка элемента с указанным номером
        	Remove();
        б) с использованием рекурсии:
        •	ввод с головы createHeadRec();
        •	ввод с хвоста createTailRec();
        •	вывод (возвращается строка, сформированная из элементов списка) toStringRec().
        */
package lr9.exercise8;

public class SinglyLinkedList {

    public static class Node {
        private Node next;
        private String data;

        public Node(String data) {
            this.data = data;
        }
        @Override
        public String toString() {
            return data.toString();
        }
    }

    private static Node head; // Голова - это первый узел связного списка
    private static Node tail; // Хвост - это последний узел связного списка



    /**
     * проверяет, пуст ли список
     *
     * @возвращает true если связный список пуст, т.е., узлов нет
     */
    public boolean isEmpty() {
        return length() == 0;
    }

    /**
     * добавляет узел в хвост связного списка
     *
     * @param data
     */
    public void createTail(String data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        tail().next = new Node(data);
        }

    public void addLast(String data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        tail().next = new Node(data);
    }

    /**
     * возвращает последний узел или хвост данного связного списка
     *
     * @return последний узел
     */
    public Node tail() {
        Node tail = head;
        // Находит последний элемент связного списка, известный как хвост
        while (tail.next != null) {
            tail = tail.next;
        }
        return tail;
    }

    public Node head() {
        Node tail = head;
        // Находит  элемент связного списка, известный как Голова
        while (tail.next == null) {
            tail = tail.next;
        }
        return head;
    }

    public void createHead(String data) { //ввод с головы
        Node a = new Node(data);
        if (head == null) {
            head = new Node(data);
            return;
        }
        a.next = head;
        head=a;
    }

    public void addFirst(String data) {
        Node a = new Node(data);
        if (head == null) {
            head = new Node(data);
            return;
        }
        a.next = head;
        head=a;
    }




    /**
     * метод возвращающий длину связного списка
     *
     * @return длину, т.е, число узлов в связном списке
     */
    public int length() {
        int length = 0;
        Node current = head;

        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    public void insert(String data, int index) { //вставка элемента в список с указанным номером Insert();
        Node a = new Node(data);

        for(int i = 0; i < length(); i++){
            //объекты нужно куда-то поместить, чтобы назначить им индексы?
        }
        if (head == null) {
            head = new Node(data);
            return;
        }
        a.next = head;
        head=a;
    }


    /**
     * получения n-го узла от конца
     *
     * @param n
     * @return n-й узел от последнего
     */
    public String getLastNode(int n) {
        Node fast = head;
        Node slow = head;
        int start = 1;

        while (fast.next != null) {
            fast = fast.next;
            start++;

            if (start > n) {
                slow = slow.next;
            }
        }

        return slow.data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        Node current = head;
        while (current != null) {
            sb.append(current).append("-->");
            current = current.next;
        }

        if (sb.length() >= 3) {
            sb.delete(sb.length() - 3, sb.length());

        }
        return sb.toString();
    }

}

