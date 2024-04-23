/**7. В кругу стоят N человек, пронумерованных от 1 до N.
 При ведении счета по кругу вычеркивается каждый второй человек,
 пока не останется один. Составить две программы, моделирующие процесс.
 Одна из программ должна использовать класс ArrayList, а вторая — LinkedList.
 Какая из двух программ работает быстрее? Почему? */
package lr9.exercise7;

import java.util.LinkedList;

public class LinkedListDemo {

        public static void main (String args[]){
            // точка начала отсчета времени выполнения программы
            long start = System.currentTimeMillis();
            System.out.println(start);

// создать связный список
            LinkedList<String> ll = new LinkedList<String>();
            // ввести элементы в связный список
            ll.add("Аня");
            ll.add("Боря");
            ll.add("Вова");
            ll.add("Гоша");
            ll.add("Дима");
            ll.add("Ева");
            ll.add("Жора");

            System.out.println("Paзмep связного списка ll "
                    + "после ввода элементов: "
                    + ll.size());
            // вывести связный список
            System.out.println("Coдepжимoe связного списка ll: " + ll);

            int num = ll.size();
            int pass = 0;

            while (ll.size() > 1) {
                if (pass == 0) {
                    for (int i = 0, del = 1; i < num; i++) {
                        if (i % 2 != 0) {
                            ll.remove(del);

                            System.out.println("Coдepжимoe связного списка ll после шага : " + ll);
                            del++;
                            pass = 0;

                        } else pass = 1;
                    }
                    num = ll.size();
                } else {
                    for (int i = 0, del = 0; i < num; i++) {
                        if (i % 2 == 0) {
                            ll.remove(del);
                            System.out.println("Coдepжимoe связного списка ll после шага : " + ll);
                            del++;
                            pass = 0;
                        } else pass = 1;

                    }
                    num = ll.size();
                }
            }
            System.out.println("Paзмep связного списка ll "
                    + "после удаления элементов:"
                    + ll.size());

            System.out.println("Coдepжимoe связного списка ll: " + ll);
            // точка окончания отсчета времени выполнения программы
            long end = System.currentTimeMillis();
            System.out.println(end);

            System.out.println("Время выполнения операции с linkedList = " + (end-start));
        }
}




