/*1068. Сумма
Ограничение времени: 2.0 секунды
Ограничение памяти: 64 МБ
Всё, что от вас требуется — найти сумму всех целых чисел, лежащих между 1 и N включительно.
Исходные данные
В единственной строке расположено число N, по модулю не превосходящее 10000.
Результат
Выведите целое число — ответ задачи.
Пример
исходные данные	результат
-3
-5
*/
package timus.task_1068;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число: ");

        int a = in.nextInt();
        int sum = 0;

        if (a < 0 && a >-10000){
            for (int i = a; i <= 1; i++){
                sum = sum + i;
            }
        } else if (a >= 0 && a <10000){
            for (int i = 1; i <= a; i++){
                sum = sum + i;
            }
        } else {
            System.out.println("число N, по модулю превосходящее 10000");
        }
        System.out.println(sum);
    }
}
