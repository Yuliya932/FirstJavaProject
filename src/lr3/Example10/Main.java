/*10. Напишите программу, в которой создается целочисленный
массив, заполняется случайными числами и после этого значения элементов в
массиве сортируются в порядке убывания значений*/
package lr3.Example10;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random(); // Создание объекта класса Random для генерации случайного числа
        int size = random.nextInt(20);
        Integer array [];
        array = new Integer [size];

        for (int i = 0 ; i <= size - 1; i++) {

            array[i] = random.nextInt(200);
            System.out.println("[" + i + "], значение: " +array[i]);

        }
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Произведена сортировка массива");
        for (int i = 0 ; i <= size - 1; i++) {


            System.out.println("[" + i + "] после сортировки, значение: " +array[i]);

        }





    }
}