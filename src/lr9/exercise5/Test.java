/*класс Test в котором создается однонаправленный связный список и заполняется значениями
 * */
package lr9.exercise5;

public class Test {
    public static void main(String[] args) {
        //создание несвязанных узлов с помощью конструктора
        Node node0 = new Node(0, null); //нулевой узел - будет головой в списке
        Node node1 = new Node(1, null);
        Node node2 = new Node(2, null);
        Node node3 = new Node(3, null); // последний элемент будет хвостом в списке

        //Связывание узлов в список с помощью ссылок
        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        //вывод списка с использованием вспомогательной переменной ref
        //соответствующей текущему значению ссылки при прохождении по ссылке
        Node ref = node0;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
