/*4. Напишите программу, которая проверяет, попадает ли введение
пользователем число в диапазон от 5 до 10 включительно*/
package lr2;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = in.nextInt();

        if (number >=5 & number <=10) {
            System.out.println("Число попадает в диапазон от 5 до 10 включительно");
        }
        else System.out.println("Число не попадает в диапазон от 5 до 10 включительно");

        if (number >5) {
            System.out.println("Число больше 5 ");
        }
        else if (number==5) {
            System.out.println("Число равно 5 ");
        }
        else System.out.println("Число меньше 5");

        if (number <10) {
            System.out.println("Число меньше 10 ");
        }
        else if (number == 10) {
            System.out.println("Число  равно 10 ");
        }
        else System.out.println("Число больше 10");
    }
}