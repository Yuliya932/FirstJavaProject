/*1. Напишите программу, которая проверяет, делится ли введенное
Пользователем число на 3.*/
package lr2;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = in.nextInt();

        int div = number % 3;

        if (div == 0) {
            System.out.println("Делится без остатка");
        }
        else System.out.println("Делится c остатком");
    }
}