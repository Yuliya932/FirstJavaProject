/*Задание 1
В программе, вычисляющей среднее значение среди положительных элементов одномерного массива (тип элементов int),
вводимого с клавиатуры, могут возникать ошибки в следующих случаях:
–	ввод строки вместо числа;
–	несоответствие числового типа данных;
–	положительные элементы отсутствуют.
/////
–	определить экспериментально, ошибки каких классов будут сгенерированы;
–	создать обработчики исключительных ситуаций с использованием выявленных классов
и всех секций конструкции обработчика с соответствующими сообщениями, позволяющими корректно выполнить программу.

*/
package lr13.example15;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел в массиве");
        int numbersCount = scanner.nextInt();
        int[] array = new int[numbersCount];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите число");

//            try {
                array[i] = scanner.nextInt();
//                if (scanner.nextInt() = (int) "\\d") {
//                    throw new InputMismatchException("ввод строки вместо числа1");
//
//                }
//            } catch (InputMismatchException e) {
////            } catch (InputMismatchException e) {
//                System.out.println("ввод строки вместо числа2");
//
//            }
            //InputMismatchException
            if (array[i] > 0) {
                sum = sum + array[i];
            }
        }
        double avg = (double) sum / array.length;
//        try {
//            if (sum > 0 ) {
                System.out.println("Среднее значение среди положительных элементов одномерного массива: " + avg);
//            }
//            throw new Exception("Для вычисления нет положительных чисел");
//        } catch (Exception e) {
//            System.out.println(e);
//        }
    }
}
