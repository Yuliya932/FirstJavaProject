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
        System.out.println("создан связный список : " + list);

        list.createHead("777");
        list.createTail("444");
        System.out.println("связный список после createHead и createTail : " + list);

        list.addFirst("111");
        list.addLast("999");
        System.out.println("связный список после addFirst и addLast : " + list);

        list.insert("44",2);
        System.out.println("связный список после insert: " + list);

        list.removeLast();
        list.removeFirst();
        System.out.println("связный список после removeFirst и removeLast: " + list);

        list.remove(1);
        System.out.println("связный список после remove 1 элемента: " + list);

        System.out.println("вывод (возвращается строка, сформированная из элементов списка) toStringRec():");
        list.toStringRec(list.head());
        System.out.println("");

        list.createHeadRec(1,3);
        System.out.println("связный список после createHeadRec: " + list);

        list.createTailRec(1,3);
        System.out.println("связный список после createTailRec: " + list);
    }
}


