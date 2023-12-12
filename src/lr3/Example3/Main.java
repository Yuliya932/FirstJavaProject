/*3. Напишите программу, которая выводит последовательность чисел
Фибоначчи. Первые два числа в этой последовательности равны 1, а каждое
следующее число равно сумме двух предыдущих
(получается последовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее).
Количество чисел в последовательности вводится пользователем.
Предложите версии программы, использующие разные операторы цикла.*/
package lr3.Example3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел в последовательности");
        int index = in.nextInt();

        long n0 = 1;
        long n1 = 1;
        System.out.println("Цикл for: ");
        System.out.print(n0  +" ");

        if (index >1 ){

            System.out.print(n1 + " ");
            for (int i = 3; i <= index; i++) {
                long n2 = n0 + n1;
                n0 = n1;
                n1 = n2;
                System.out.print(n2 + " ");
            }
        }
        System.out.println("");
        System.out.println("Цикл while: ");
        n0 = 1;
        n1 = 1;
        System.out.print(n0  +" ");

        if (index>1) {

            System.out.print(n1 + " ");
            int j = 3;
            while (j <= index) {
                long n2 = n0 + n1;
                n0 = n1;
                n1 = n2;
                System.out.print(n2 + " ");
                j++;
            }
        }





    }
}