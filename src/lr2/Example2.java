/*2. Напишите программу, которая проверяет, удовлетворяет ли введенное
пользователем число следующим критериям: при делении на 5 в остатке
получается 2, а при делении на 7 в остатке получается 1.*/
package lr2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = in.nextInt();

        int div1 = number % 5;
        int div2 = number % 7;

        if (div1 == 2 & div2 == 1) {
            System.out.println("Число удовлетворяет критериям");
        }
        else System.out.println("Число не удовлетворяет критериям");
        System.out.println ("При делении на 5 остаток = "+div1);
        System.out.println ("При делении на 7 остаток = "+div2);
        System.out.println ("Условие: число / на 5 остаток =2, число / 7 остаток =1");

    }
}