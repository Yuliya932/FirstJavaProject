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


public class Main {
    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();
        list.createTail("1");
        list.createTail("2");
        list.createTail("3");
        list.createTail("4");


        SinglyLinkedList.Node r = new SinglyLinkedList.Node("77");

        list.createHead("777");

        list.createTail("444");

        list.addFirst("111");

        list.addLast("999");


        System.out.println("связный список : " + list);
        System.out.println(list.head());
        System.out.println(list.tail());


//        MyList f = new MyList();
//        MyList.cr


//        System.out.println("Первый узел от конца: " + list.getLastNode(1));
//        System.out.println("Второй узел от конца: " + list.getLastNode(2));
//        System.out.println("Третий узел от конца: " + list.getLastNode(3));

//        //создание несвязанных узлов с помощью конструктора
//        Node node0 = new Node(0, null); //нулевой узел - будет головой в списке
//        Node node1 = new Node(1, null);
//        Node node2 = new Node(2, null);
//        Node node3 = new Node(3, null); // последний элемент будет хвостом в списке
//
//        //Связывание узлов в список с помощью ссылок
//        node0.next = node1;
//        node1.next = node2;
//        node2.next = node3;
//        //вывод списка с использованием вспомогательной переменной ref
//        //соответствующей текущему значению ссылки при прохождении по ссылке
//        Node ref = node0;
//        while (ref != null) {
//            System.out.print(" " + ref.value);
//            ref = ref.next;
//        }
//        System.out.println("");
//        System.out.println();
//
//
//
//
//        Node ref1 = node0;
//        ref=Node.createHead(2);
//
//        while (ref != null) {
//            System.out.print(" " + ref.value);
//            ref = ref.next;
//        }

    }
    }

