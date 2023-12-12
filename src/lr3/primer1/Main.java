/*Напишите программу, в которой создается массив п
заполняется случайными числами. Массив отображается в консольном окне.
В этом массиве необходимо определить элемент с минимальным значением. В
частности, программа должна вывести значение элемента с минимальным
значением и индекс этого элемента. Если элементов с минимальным
значением несколько, должны быть выведены индексы всех этих элементов.
*/

package lr3.primer1;

import java.util.Arrays; //пакет для подключения класса
import java.util.Random; //пакет для подключения класса
import java.util.Scanner; //пакет для подключения класса

public class Main {

    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = id.nextInt();
        System.out.println("Размер массива равен " + size);
        int[] nums = new int[size]; // Создение массива с размером, введенным из консоли
        Random random = new Random(); // Создание объекта класса Random для генерации случайного числа

        for (int i = 0; i< nums.length; i++){
            nums [i] = random.nextInt(200); // Присвоение i-ому элементу массива случайного значения
            System.out.println("Элемент массива ["+i+"] = " + nums[i]);

        }
        Arrays.sort(nums); // Сортировка массива по возрастанию его элементов
        System.out.println("Произведена сортировка массива");
        for (int i = 0; i < nums.length; i++){
            System.out.println("Элемент массива ["+i+"] после сортировки = " + nums[i]);

        }

    }
}