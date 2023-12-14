/*3. Напишите программу, в которой создается двумерный массив, который
выводи прямоугольник из цифр 2;*/
package lr4.Example3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите длину прямоугольника");
        int a = in.nextInt();
        System.out.println("Введите ширину прямоугольника");
        int b = in.nextInt();
        int i, j;

        int [] [] arrayInt = new int[a][b];

        for (  i = 0 ; i < a ; i++){
            for (  j = 0 ; j < b ; j++){
                arrayInt [i] [j] = 2;
            }
        }
        for (  i = 0 ; i < a ; i++){
            System.out.print("номер строки: " + (i+1) + " ");
            for (  j = 0 ; j < b ; j++){
                System.out.print(arrayInt[i] [j]);
            }
            System.out.println(" Количество символов в строке " + j);
        }


    }
}
