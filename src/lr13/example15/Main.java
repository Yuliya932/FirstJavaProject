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

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел в массиве");
        int numbersCount = scanner.nextInt();
        int[] array = new int[numbersCount];
        int sum_int = 0;
        int sum_pos = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите число");
            try {
                Integer b = Integer.parseInt(scanner.next());
                sum_int += b;
                if (b > 0) {
                    sum_pos += b;
                }
            } catch (NumberFormatException e) {
                System.out.println("Ввод строки вместо числа или несоответствие числового типа данных");
                return;
            }
        }
        try {
            if (sum_pos == 0 && sum_int != 0) {
                throw new RuntimeException("Положительные элементы отсутствуют");
            }
            System.out.println("Сумма положительных элементов массива: " + sum_pos);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            return;
        }
    }
}
