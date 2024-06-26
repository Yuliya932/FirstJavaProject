/*вариант метода main, в котором список строится изначальным созданием «хвоста», причем для него создавать дополнительную переменную не нужно.
Узел «головы» получается путем создания нового узла, в котором старая ссылка на «голову» становится полем next, т.е. «хвостом».
*/
package lr9.exercise5;

public class Test2 {
    public static void main(String[] args) {
        //добавление элементов с перемещением головы (наращивание головы)
        Node head = null; //начальное значение ссылки на голову
        for(int i = 9; i >= 0; i--){
            head = new Node (i, head);
        }
        // вывод элементов на экран
        Node ref = head;
        while (ref != null){
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
