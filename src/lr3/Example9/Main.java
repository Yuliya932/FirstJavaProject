/*9. Напишите программу, в которой создается массив и заполняется
случайными числами. Массив отображается в консольном окне. В этом
массиве необходимо определить элемент с минимальным значением. В
частности, программа должна вывести значение элемента с минимальным
значением и индекс этого элемента. Если элементов с минимальным
значением несколько, должны быть выведены индексы всех этих элементов*/
package lr3.Example9;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random(); // Создание объекта класса Random для генерации случайного числа
        int size = random.nextInt(20);
        int array [];
        array = new int [size];

        for (int i = 0 ; i <= size - 1; i++) {

            array[i] = random.nextInt(3);
            System.out.println("[" + i + "], значение: " +array[i]);

        }

        int array2 [];
        array2 = new int [size];
        for (int i = 0 ; i <= size - 1; i++) {

            array2[i] = array[i];


        }


        Arrays.sort(array2);
        System.out.println("Мин. значения массива");


        for (int i = 0 ; i <= size - 1; i++) {

            if (array[i] == array2[0]) {
                System.out.println("[" + i + "], мин. значение: " + array[i]);
            }

        }



    }
}