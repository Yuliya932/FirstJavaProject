/*7. В кругу стоят N человек, пронумерованных от 1 до N.
При ведении счета по кругу вычеркивается каждый второй человек,
пока не останется один. Составить две программы, моделирующие процесс.
Одна из программ должна использовать класс ArrayList, а вторая — LinkedList.
Какая из двух программ работает быстрее? Почему? */
package lr9.exercise7;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String args[]) {
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        System.out.println(start);

        // создать списочный массив
        ArrayList<String> al = new ArrayList<String>();

        // ввести элементы в списочный массив
        al.add("Аня");
        al.add("Боря");
        al.add("Вова");
        al.add("Гоша");
        al.add("Дима");
        al.add("Ева");
        al.add("Жора");

        System.out.println("Paзмep списочного массива al "
                + "после ввода элементов: "
                + al.size());
        // вывести списочный массив
        System.out.println("Coдepжимoe списочного массива al: " + al);

        int num = al.size();
        int pass = 0;

        while ( al.size() >1) {
            if(pass==0) {
                for (int i = 0, del = 1; i < num; i++) {
                    if (i % 2 != 0 ) {
                        al.remove(del );

                        System.out.println("Coдepжимoe списочного массива al после шага : "  + al );
                        del++;
                        pass=0;

                    } else pass=1;
                }
            num = al.size();
            } else {
                for (int i = 0, del = 0; i < num; i++) {
                    if (i % 2 == 0 ) {
                        al.remove(del);
                        System.out.println("Coдepжимoe списочного массива al после шага : "  + al );
                        del++;
                        pass=0;
                    } else pass=1;

                }
                num = al.size();
            }
        }
        System.out.println("Paзмep списочного массива al "
                +"после удаления элементов:"
                + al.size());

        System.out.println("Coдepжимoe списочного массива al: " + al);
        long end = System.currentTimeMillis();
        System.out.println(end);

        System.out.println("Время выполнения операции с arrayList = " + (end-start));
    }
}

//Это  задача Иосифа Флавия в современной формулировке