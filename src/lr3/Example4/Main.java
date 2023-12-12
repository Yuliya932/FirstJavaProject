/*4. Напишите программу, в которой пользователем вводится два
целых числа. Программа выводит все целые числа — начиная с наименьшего
(из двух введенных чисел) и заканчивая наибольшим (из двух введенных
чисел). Предложите разные версии программы (с использованием разных
операторов цикла).*/
package lr3.Example4;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = in.nextInt();
        System.out.println("Введите второе число: ");
        int b = in.nextInt();

        System.out.println("Версия с использованием for: ");
        if (a<b) {
            for (int i = 1; i <= b - a + 1; i++) {
                int c = (a - 1) + i;
                System.out.print(c + " ");
            }
        } else {
            for (int i = 1; i <= a - b + 1; i++) {
                int c = (b - 1) + i;
                System.out.print(c + " ");
            }
        }
        System.out.println("");
        System.out.println("Версия с использованием while: ");
        int j = 1;
        if (a<b) {
            while (j <= b - a + 1) {
                int c = (a - 1) + j;
                System.out.print(c + " ");
                j++;

            }
        } else {
            while (j <= a - b + 1) {
                int c = (b - 1) + j;
                System.out.print(c + " ");
                j++;
            }
        }

    }
}