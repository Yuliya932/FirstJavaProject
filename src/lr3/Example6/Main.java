/*6. Напишите программу, в которой создается одномерный числовой
массив и заполняется числами, которые при делении на 5 дают в остатке 2
(числа 2, 7,12,17 и так далее). Размер массива вводится пользователем.
Предусмотреть обработку ошибки, связанной с вводом некорректного
значения.*/
package lr3.Example6;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int count = id.nextInt();

        if (count < 0){
            System.out.println("Введено некорректное значение");
        }

        Random random = new Random(); // Создание объекта класса Random для генерации случайного числа
        int x = random.nextInt(100);
        int array [];
        array = new int[count];

        for (int i = 0 ; i <= count - 1; i++) {

            do {
                x = random.nextInt(100);
            }
            while (x % 5 != 2);
            array[i] = x;
            System.out.print(x);
            System.out.print(" ");
        }


    }
}