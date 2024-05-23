/*Задание 3
В программе, вычисляющей сумму элементов типа byte одномерного массива, вводимого с клавиатуры, могут возникать ошибки в следующих случаях:
–	ввод строки вместо числа;
–	ввод или вычисление значения за границами диапазона типа.

/////
–	определить экспериментально, ошибки каких классов будут сгенерированы;
–	создать обработчики исключительных ситуаций с использованием выявленных классов
и всех секций конструкции обработчика с соответствующими сообщениями, позволяющими корректно выполнить программу.


*/
package lr13.example17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел в массиве");
        int numbersCount = scanner.nextInt();
        byte[] array = new byte[numbersCount];
        int sum_int = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите число");
            try {
                Byte b = Byte.parseByte(scanner.next());
                sum_int += (int) b;
            } catch (NumberFormatException e) {
                System.out.println("Ввод строки вместо числа");
                return;
            }
        }
            try {
                if (sum_int < -128 || sum_int > 127) {
                    throw new RuntimeException("Ввод или вычисление значения за границами диапазона типа");
                }
                System.out.println("Сумма элементов массива: " + (byte) sum_int);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                return;
            }
        }
    }


