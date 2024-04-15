/*2. Создать приложение с использованием рекурсии для перевода целого числа,
введенного с клавиатуры, в двоичную систему счисления.*/
package lr9.exercise2;

import java.util.Scanner;
public class Resursion {

    public static void m(int x) {
        if (x < 2) {
        } else {
            m(x / 2);
        }
        System.out.print(x % 2);
    }

    public static void main(String[] args) {
            Scanner scanner = new Scanner (System.in);
            System.out.println("Введите число которое хотите перевести в двоичное: ");
            int  c =  scanner.nextInt();
            m(c);
            scanner.close();
        }
}
//10011100. Это двоичный эквивалент десятичного числа 156
//          0	0
//        1	1
//        2	10
//        3	11
//        4	100
//        5	101
//        6	110
//        7	111
//        8	1000
//        9	1001
//        10	1010
//        11	1011
//        12	1100
//        13	1101
//        14	1110
//        15	1111
//        16	10000
//        32	100000
//        64	1000000
//        128	10000000
//        256	100000000