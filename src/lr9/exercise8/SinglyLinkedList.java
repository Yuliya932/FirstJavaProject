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

import lr9.exercise5.Node;

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
        // создается новый элемент со значением 44 – для вставки
        Node newNode=new Node(data);
        Node ref = head;    // используем временную переменную
        int k=1;   // счетчик элементов
// поиск нужного положения узла для вставки
        while (ref.next!= null && (k<index )) {
            ref = ref.next;
            k++;
        }
// переброска ссылок при вставке элемента
        newNode.next=ref.next;
        ref.next=newNode;
    }

    public void removeLast() { //удаление последнего элемента списка ;
        // создаем вспомогательную переменную
        Node ref = head;
// перемещаемся на предпоследний элемент
        while (ref.next.next != null) {
            ref = ref.next;
        }
// полю next предпоследнего элемента присваиваем null
        ref.next=null;
    }

    public void removeFirst() { //удаление элемента с головы списка;
        Node ref = head;    // используем временную переменную
        int k=1;   // счетчик элементов
// поиск нужного положения узла для вставки
        while (ref.next.next != null && (k<2)) {
            ref = ref.next;
            k++;
        }
        head=ref;
    }

    public void remove(int x) { //удаление из списка элемента с указанным номером ;
        Node ref = head; // создаем вспомогательную переменную
        int k = 1;
// поиск положения узла, предшествующего удаляемому
        while (ref.next != null && (k < x)) {
            ref = ref.next;
            k++;
        }
// переброска ссылки для исключения ненужного элемента из списка
        ref.next = ref.next.next;
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
        return sb.toString();
    }

    public void toStringRec(Node head) { //вывод (возвращается строка, сформированная из элементов списка) с использованием рекурсии
        Node ref = head;
        if (ref == null ) {
            return;
        } else
            System.out.print(ref.data + "-->");
            toStringRec(ref.next);
    }

    public void createHeadRec(int a, int b) { //ввод с головы с использованием рекурсии
        //добавление элементов с перемещением головы (наращивание головы)
        for (int i = a; i <= b; i++) {
            Node ref = new Node("h" + i);
             ref.next = head;
             head = ref;
                i++;
            if (head == null) {
                return;
            } else
                createHeadRec(i,b-a);
        }
    }

    public void createTailRec(int a, int b) { //ввод с хвоста  с использованием рекурсии
        for (int i = a; i <= b; i++) {
            Node ref = head;
            Node el = new Node("t" + i);
            while (ref.next != null) {
                ref = ref.next;
            }
                ref.next = el;
                i++;

                if (ref.next == null) {
                    return;
                } else
                    createTailRec(i, b - a);
            }
        }
}

