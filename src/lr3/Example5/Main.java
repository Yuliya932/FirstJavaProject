/*5. Напишите программу, в которой вычисляется сумма чисел,
удовлетворяющих таким критериям:
при делении числа на 5 в остатке получается 2,
или при делении на 3 в остатке получается 1.
Количество чисел в сумме вводится пользователем.
Программа отображает числа, которые суммируются, и значение суммы.
Предложите версии программы, использующие разные операторы цикла*/
package lr3.Example5;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int count = id.nextInt();

        Random random = new Random(); // Создание объекта класса Random для генерации случайного числа


        System.out.println("Использование цикла for:");

        int x = random.nextInt(1000);
        int sum = 0;
        for (int i = 1 ; i <= count; i++) {
            do {
                x = random.nextInt(1000);
            }
            while (x % 5 != 2 || x % 3 != 1);


            System.out.print(x);
            System.out.print(" ");
            sum = sum + x;
        }


        System.out.println("");
        System.out.println("Сумма: " + sum);

        System.out.println("Использование цикла while:");

        x = random.nextInt(1000);
        sum = 0;
        int j = 1;
        while ( j <= count) {
            do {
                x = random.nextInt(1000);
            }
            while (x % 5 != 2 || x % 3 != 1);


            System.out.print(x);
            System.out.print(" ");
            sum = sum + x;
            j++;
        }


        System.out.println("");
        System.out.println("Сумма: " + sum);

    }
}